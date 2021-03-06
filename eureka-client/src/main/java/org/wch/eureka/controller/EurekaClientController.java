package org.wch.eureka.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by weichunhe on 2016/6/21.
 */
@RestController
public class EurekaClientController {
    @Autowired
    RemoteHelloService remoteHelloService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("hello")
    public String hello() {
        long start = System.currentTimeMillis();
        ServiceInstance instance = loadBalancerClient.choose("h5");
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(MapUtils.getString(instance.getMetadata(), "context-path", ""));
        System.out.println(instance.getUri() + "-" + instance.getHost() + ":" + instance.getPort() + ":" + instance.getServiceId());
        return "hello eureka";
    }

    @HystrixCommand(fallbackMethod = "circuited", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
//            , @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "30000")
//            , @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2")
    })
    @RequestMapping("timeoutHello")
    public Object remoteHello() {
        System.out.println("timeout");
        return remoteHelloService.remoteHello();
    }

    @HystrixCommand(fallbackMethod = "circuited", commandProperties = {
//            ,@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000")
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "2")
    })
    @RequestMapping("errorHello")
    public Object hello2() {
        System.out.println("error");
        return remoteHelloService.remoteHello();
    }

    public String circuited() {
        System.out.println("circuited");
        return "timeout";
    }

//    @ThriftClient(serviceId = "test-service", path = "/thrift")
//    HelloWorldService.Client client;
//
//    @RequestMapping("/thrift")
//    public Object thrift(String name) throws TException {
//        System.out.println("thrift:" + name);
//        return client.sayHello(name);
//    }

    @Autowired
    RestTemplate restTemplate;
    RestTemplate template = new RestTemplate();

    @RequestMapping("ribbonHello")
    public String ribbonHello() {
        System.out.println(template.getForEntity("https://raw.githubusercontent.com/1329555958/myspring/master/cp", String.class).getBody());
        return restTemplate.getForEntity("http://test-service/hello", String.class).getBody();
    }


}

package org.wch.eureka.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import info.developerblog.spring.thrift.annotation.ThriftClient;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.wch.eureka.thrift.HelloWorldService;

import java.util.Objects;

/**
 * Created by weichunhe on 2016/6/21.
 */
@RestController
public class EurekaClientController {
    @Autowired
    RemoteHelloService remoteHelloService;

    @RequestMapping("hello")
    public String hello() {
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

    @ThriftClient(serviceId = "test-service", path = "/thrift")
    HelloWorldService.Client client;

    @RequestMapping("/thrift")
    public Object thrift(String name) throws TException {
        System.out.println("thrift:" + name);
        return client.sayHello(name);
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("ribbonHello")
    public String ribbonHello() {
        return restTemplate.getForEntity("http://test-service/hello", String.class).getBody();
    }
}

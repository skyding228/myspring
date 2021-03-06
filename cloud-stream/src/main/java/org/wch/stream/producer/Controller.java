package org.wch.stream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weichunhe on 2016/6/27.
 */
@RestController
public class Controller {

    @Autowired
    private Producer producer;

    @RequestMapping("/hi")
    public Object hi(String msg) {
        producer.send(msg);
//        producer.send(msg);
//        producer.send(msg);
//        producer.producer(msg);
        producer.producer(msg);
        return "hi-" + msg;
    }
}

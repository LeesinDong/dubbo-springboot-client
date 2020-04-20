package com.leesin.dubbospringbootclient;

import com.leesin.ISayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Leesin Dong
 * @date: Created in 2020/4/20 9:47
 * @modified By:
 */
@RestController
public class DubboController {
    @Reference(cluster = "failfast",loadbalance = "random" ,timeout = 1,mock = "com.leesin.dubbospringbootclient.MockSayHelloService")
    //        dubbo提供的，相当于autowire
    ISayHelloService sayHelloService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return sayHelloService.sayHello();
    }
}

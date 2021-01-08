package com.leesin.dubbospringbootclient;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DubboSpringbootClientApplicationTests {

    @Resource
    MockSayHelloService mockSayHelloService;

    @Test
    void contextLoads() {
        mockSayHelloService.sayHello();
    }

}

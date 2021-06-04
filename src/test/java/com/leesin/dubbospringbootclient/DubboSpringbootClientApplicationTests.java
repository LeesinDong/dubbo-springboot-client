package com.leesin.dubbospringbootclient;

import com.leesin.spring.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboSpringbootClientApplicationTests {

    @Resource
    MockSayHelloService mockSayHelloService;
    @Resource
    TestService testService;

    @Test
    public void contextLoads() {
        mockSayHelloService.sayHello();
    }

    @Test
    public void add() {
        testService.add();
    }
}

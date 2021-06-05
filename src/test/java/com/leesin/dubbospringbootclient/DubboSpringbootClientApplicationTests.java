package com.leesin.dubbospringbootclient;

import com.leesin.spring.entity.UserDo;
import com.leesin.spring.service.mybatisplus.MybatisPlusService;
import com.leesin.spring.service.transaction.TestService;
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
    @Resource
    MybatisPlusService mybatisPlusService;

    @Test
    public void contextLoads() {
        mockSayHelloService.sayHello();
    }

    @Test
    public void add() {
        testService.add();
    }

    @Test
    public void plusSave() {
        mybatisPlusService.saveUser();
    }

    @Test
    public void find() {
        UserDo user = mybatisPlusService.findUser();
        System.out.println(user);
    }
}

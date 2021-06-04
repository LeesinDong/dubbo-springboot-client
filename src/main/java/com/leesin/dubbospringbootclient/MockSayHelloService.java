package com.leesin.dubbospringbootclient;

import com.leesin.ISayHelloService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Leesin Dong
 * @date: Created in 2020/4/20 14:17
 * @modified By:
 */
@Service
public class MockSayHelloService implements ISayHelloService {
    @Override
    public String sayHello() {
        return "sorry，服务器发生异常，被降级了";
    }

    @Override
    public String sayByeBye(String s) {
        return null;
    }
}

package com.leesin.spring.service;

import com.leesin.spring.dao.UserMapper;
import com.leesin.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestService {
    @Autowired
    UserMapper userMapper;
    @Resource
    TestService testService;
    @Autowired
    Test2 testService2;

    /**
     * ff
     */
    // @Transactional(rollbackFor = Exception.class)
    public void add () {
        User user = new User("服部半藏");
        userMapper.insertSelective(user);

        testService.add2();
    }

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public void add2() {
        User user = new User("风魔小太郎");
        userMapper.insertSelective(user);
        if (true) {
            throw new RuntimeException("save 抛异常了");
        }
        User user1 = new User("风魔小太郎2");
        userMapper.insertSelective(user1);
    }
}

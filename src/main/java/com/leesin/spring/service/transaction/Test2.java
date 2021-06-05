package com.leesin.spring.service.transaction;

import com.leesin.spring.mapper.UserMapper;
import com.leesin.spring.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class Test2 {
    @Resource
    UserMapper userMapper;

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

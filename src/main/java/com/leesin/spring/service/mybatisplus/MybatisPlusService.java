package com.leesin.spring.service.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.leesin.spring.mapper.UserPlusMapper;
import com.leesin.spring.entity.UserDo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dongxueyuan
 */
@Service
public class MybatisPlusService {
    @Resource
    UserPlusMapper userPlusMapper;

    public void saveUser() {
        UserDo userDo = new UserDo();
        userDo.setId(10L);
        userDo.setName("ai");
        userPlusMapper.insert(userDo);
    }

    public UserDo findUser() {
        QueryWrapper<UserDo> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 31);

        return userPlusMapper.selectOne(wrapper);
    }
}

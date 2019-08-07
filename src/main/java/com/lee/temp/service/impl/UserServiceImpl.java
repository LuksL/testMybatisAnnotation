package com.lee.temp.service.impl;

import com.lee.temp.dao.UserMapper;
import com.lee.temp.entity.User;
import com.lee.temp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Lee
 * @Date 2019-08-07
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}

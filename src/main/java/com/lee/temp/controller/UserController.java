package com.lee.temp.controller;

import com.lee.temp.entity.User;
import com.lee.temp.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Lee
 * @Date 2019-08-07
 */
@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") int id) {
        User user = userService.getUserById(id);
        return user;
    }
}

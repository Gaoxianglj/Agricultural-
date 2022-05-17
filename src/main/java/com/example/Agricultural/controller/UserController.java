package com.example.Agricultural.controller;

import com.example.Agricultural.entity.User;
import com.example.Agricultural.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
public class UserController {
    @Resource
    UserService userService;
    /**
     * 查询所有用户。
     *
     */
    @PostMapping("/user/all")
    public User[] SelectAllUser(){
        return userService.SelectAllUser();
    }
}

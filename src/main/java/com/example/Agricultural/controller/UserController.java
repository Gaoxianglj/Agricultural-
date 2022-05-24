package com.example.Agricultural.controller;

import com.example.Agricultural.entity.User;
import com.example.Agricultural.exception.BusinessFailureException;
import com.example.Agricultural.requestdto.UserForm;
import com.example.Agricultural.service.UserService;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/user/updatePassword")
    public void updateUserPassword(@RequestBody UserForm userForm, Errors errors)
    {
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }

        System.out.println(userForm.getUserId()+" "+ userForm.getPassword());
        userService.updateUserPassword(userForm);
    }
}

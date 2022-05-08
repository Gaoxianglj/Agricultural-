package com.example.Agricultural.controller;

import com.example.Agricultural.entity.User;
import com.example.Agricultural.exception.BusinessFailureException;
import com.example.Agricultural.requestdto.LoginForm;
import com.example.Agricultural.service.LoginService;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 登录接口处理器。
 */
@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    /**
     * 用户登录。
     * <p>根据用户名、密码登录系统</p>
     * 
     * @param form 用户名，密码。
     * @param errors 参数校验错误信息
     * @return 用户信息。
     */
    @PostMapping("/login")
    public User login(@RequestBody @Valid LoginForm form, Errors errors) {
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }

        return loginService.login(form.getUserName(), form.getPassword());
    }


}

package com.example.Agricultural.controller;

import com.example.Agricultural.exception.BusinessFailureException;
import com.example.Agricultural.requestdto.RegistrationFrom;
import com.example.Agricultural.service.RegistrationService;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
@CrossOrigin
@RestController
public class RegistrationController {
    @Resource
    RegistrationService registrationService;
    /**
     * 用户注册。
     * <p>根据用户填写内容注册用户信息</p>
     *
     * @param form 用户名，密码,确认密码。
     * @param errors 参数校验错误信息
     */
    @PostMapping("/registration")
    public void registration(@RequestBody @Valid RegistrationFrom form, Errors errors){
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }
        registrationService.Registration(form.forUser());

    }
}

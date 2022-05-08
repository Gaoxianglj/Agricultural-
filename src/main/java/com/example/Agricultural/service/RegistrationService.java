package com.example.Agricultural.service;

import com.example.Agricultural.entity.User;

public interface RegistrationService {
    /**
     * 用户注册。
     * <p>根据用户填写内容注册用户信息</p>
     *
     * @param user 用户信息
     */
    public void Registration( User user);
}

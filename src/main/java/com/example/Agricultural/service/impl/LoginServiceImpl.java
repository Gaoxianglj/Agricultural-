package com.example.Agricultural.service.impl;


import com.example.Agricultural.dao.UserDao;
import com.example.Agricultural.entity.User;
import com.example.Agricultural.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 登录业务实现层。
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserDao userDao;


    /**
     * 用户登录。
     * <p>根据用户名、密码登录系统</p>
     *
     * @param userName 用户名
     * @param password 密码
     * @return 用户信息
     */
    @Override
    public User login(String userName, String password) {
        // 根据用户名、密码查询用户信息。

        return userDao.selectByUserNameAndPassword(userName, password);
    }
}

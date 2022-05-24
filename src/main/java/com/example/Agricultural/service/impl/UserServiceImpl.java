package com.example.Agricultural.service.impl;

import com.example.Agricultural.dao.UserDao;
import com.example.Agricultural.entity.User;
import com.example.Agricultural.requestdto.UserForm;
import com.example.Agricultural.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    /**
     * 查询所有用户。
     *
     */
    @Override
    public User[] SelectAllUser() {
        return userDao.SelectAllUser();
    }

    @Override
    public void updateUserPassword(UserForm userForm) {
        userDao.updateUserPassword(userForm);
    }
}

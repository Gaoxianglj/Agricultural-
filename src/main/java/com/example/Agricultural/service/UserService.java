package com.example.Agricultural.service;

import com.example.Agricultural.entity.User;
import com.example.Agricultural.requestdto.UserForm;

public interface UserService {
    /**
     * 查询所有用户。
     *
     */
    User[] SelectAllUser();

    void updateUserPassword(UserForm userForm);

}

package com.example.Agricultural.dao;

import com.example.Agricultural.entity.User;
import com.example.Agricultural.requestdto.UserForm;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 17:45:13
 */
 @Mapper
public interface UserDao {

    /**
     * 通过账号密码查询单条数据
     *
     * @param userName 用户名
     * @param password 密码
     * @return 实例对象
     */
    User selectByUserNameAndPassword(@Param("userName")String userName, @Param("password") String password);
    /**
     * 注册账号
     *
     * @param user 用户实体类
     */
    int registration(@Param("user") User user);
    /**
     * 查询所有用户。
     *
     */
    User[] SelectAllUser();
    /**
     * 查询用户名
     */
    String SelectUserName(@Param("userId")Integer userId);

    /**
     *
     * @param userId 用户id
     * @return 用户
     */
    User SelectUserForId(@Param("userId") Integer userId);

    void updateUserPassword(UserForm userForm);
}


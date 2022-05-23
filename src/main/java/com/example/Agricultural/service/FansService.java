package com.example.Agricultural.service;

import com.example.Agricultural.entity.User;

import java.util.List;

public interface FansService {
    /**
     * 查询关注你的人
     * @param userId 用户id
     * @return 关注你的人的列表
     */
    public List<User> MyFans(Integer userId);
}

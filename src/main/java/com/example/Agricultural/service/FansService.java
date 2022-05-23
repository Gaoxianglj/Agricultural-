package com.example.Agricultural.service;

import com.example.Agricultural.entity.User;
import com.example.Agricultural.requestdto.FansForm;

import java.util.List;

public interface FansService {
    /**
     * 查询关注你的人
     * @param userId 用户id
     * @return 关注你的人的列表
     */
    public List<User> MyFans(Integer userId);

    List<Integer> myFocus(Integer userId);

    void addFocus(FansForm form);

    void deleteFocus(FansForm form);
}

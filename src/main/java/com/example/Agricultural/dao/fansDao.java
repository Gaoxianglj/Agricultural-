package com.example.Agricultural.dao;

import com.example.Agricultural.entity.Fans;
import com.example.Agricultural.entity.User;
import com.example.Agricultural.requestdto.userIdForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface fansDao {
    /**
     * 查询用户关注列表
     * @param userId 用户Id
     * @return 关注的人的用户Id列表
     */
    public List<String> SelectUpUserIdList(@Param("userId") Integer userId);

    public List<String> SelectFansUserIdList(@Param("userId") Integer userId);
}

package com.example.Agricultural.dao;

import com.example.Agricultural.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface commentDao {
    /*添加评论*/
    public int addComment(@Param("comment") Comment c);
}

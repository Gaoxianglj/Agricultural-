package com.example.Agricultural.dao;

import com.example.Agricultural.entity.Comment;
import com.example.Agricultural.entity.Functional.CommentResult;
import com.example.Agricultural.requestdto.ContentForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface commentDao {
    /*添加评论*/
    public int addComment(@Param("comment") Comment c);

    List<CommentResult> selectAllComment(@Param("content") ContentForm c);
}

package com.example.Agricultural.service.impl;

import com.example.Agricultural.dao.commentDao;
import com.example.Agricultural.entity.Comment;
import com.example.Agricultural.entity.Functional.CommentResult;
import com.example.Agricultural.requestdto.ContentForm;
import com.example.Agricultural.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private commentDao commentDao;
    public void addComment(Comment c)
    {
        int i = commentDao.addComment(c);
        if(i<=0)
        {
            throw new RuntimeException("评论失败");
        }

    }

    @Override
    public List<CommentResult> selectAllComment(ContentForm contentForm) {
        return commentDao.selectAllComment(contentForm);
    }
}

package com.example.Agricultural.service;

import com.example.Agricultural.entity.Comment;
import com.example.Agricultural.entity.Functional.CommentResult;
import com.example.Agricultural.requestdto.ContentForm;

import java.util.List;

public interface CommentService {
    public void addComment(Comment c);

    List<CommentResult> selectAllComment(ContentForm contentForm);
}

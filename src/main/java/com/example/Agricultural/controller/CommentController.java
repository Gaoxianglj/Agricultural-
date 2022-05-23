package com.example.Agricultural.controller;

import com.example.Agricultural.entity.Comment;
import com.example.Agricultural.exception.BusinessFailureException;
import com.example.Agricultural.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;
    @PostMapping("/comment/addcomment")
    public void addComment(@RequestBody @Valid Comment c, Errors errors)
    {
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }
        System.out.println(c.getContentId());
        commentService.addComment(c);
    }

}

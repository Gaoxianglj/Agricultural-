package com.example.Agricultural.entity;

import java.io.Serializable;

/**
 * 评论表(Comment)实体类
 *
 * @author makejava
 * @since 2022-05-08 17:40:50
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = -37129250789475785L;
    
    private Integer commentId;
    /**
     * 内容id
     */
    private Integer contentId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 评论内容
     */
    private String commentContent;


    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

}


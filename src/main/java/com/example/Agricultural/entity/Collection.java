package com.example.Agricultural.entity;

import java.io.Serializable;

/**
 * 收藏表(Collection)实体类
 *
 * @author makejava
 * @since 2022-05-08 17:40:50
 */
public class Collection implements Serializable {
    private static final long serialVersionUID = -96078291470421364L;
    
    private Integer collectionId;
    /**
     * 内容id
     */
    private Integer contentId;
    /**
     * 用户id
     */
    private Integer userId;


    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
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

}


package com.example.Agricultural.entity;

import java.io.Serializable;

/**
 * 粉丝表(Fans)实体类
 *
 * @author makejava
 * @since 2022-05-08 17:40:48
 */
public class Fans implements Serializable {
    private static final long serialVersionUID = 857297061480340597L;
    
    private Integer fansId;
    /**
     * 博主userid
     */
    private Integer upUserId;
    /**
     * 关注者id
     */
    private Integer fansUserId;


    public Integer getFansId() {
        return fansId;
    }

    public void setFansId(Integer fansId) {
        this.fansId = fansId;
    }

    public Integer getUpUserId() {
        return upUserId;
    }

    public void setUpUserId(Integer upUserId) {
        this.upUserId = upUserId;
    }

    public Integer getFansUserId() {
        return fansUserId;
    }

    public void setFansUserId(Integer fansUserId) {
        this.fansUserId = fansUserId;
    }

}


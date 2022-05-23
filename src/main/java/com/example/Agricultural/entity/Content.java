package com.example.Agricultural.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 内容表(Content)实体类
 *
 * @author makejava
 * @since 2022-05-08 17:40:50
 */
public class Content implements Serializable {
    private static final long serialVersionUID = -50773698983936330L;
    
    private Integer contentId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 标题
     */
    private String title;
    /**
     * 详细内容
     */
    private String detail;
    /**
     * 点赞数
     */
    private Integer tagNumber;
    /**
     * 发布时间
     */
    private Date releaseTime;
    /**
     * 内容标签
     */
    private String contentLabel;

    /**
     *
     * 视频url
     */
    private String videoUrl;

    /**
     *
     * 点赞数
     */
    private Integer likenum;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(Integer tagNumber) {
        this.tagNumber = tagNumber;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getContentLabel() {
        return contentLabel;
    }

    public void setContentLabel(String contentLabel) {
        this.contentLabel = contentLabel;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }
}


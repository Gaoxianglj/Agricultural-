package com.example.Agricultural.entity;

import java.io.Serializable;

/**
 * (Contentphoto)实体类
 *
 * @author makejava
 * @since 2022-05-22 18:41:48
 */
public class Contentphoto implements Serializable {
    private static final long serialVersionUID = 818241658988159496L;
    
    private Integer contentphotoId;
    //内容表id
    private Integer contentId;
    
    private String purl1;
    
    private String purl2;
    
    private String purl3;
    
    private String purl4;
    
    private String purl5;
    
    private String purl6;


    public Integer getContentphotoId() {
        return contentphotoId;
    }

    public void setContentphotoId(Integer contentphotoId) {
        this.contentphotoId = contentphotoId;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getPurl1() {
        return purl1;
    }

    public void setPurl1(String purl1) {
        this.purl1 = purl1;
    }

    public String getPurl2() {
        return purl2;
    }

    public void setPurl2(String purl2) {
        this.purl2 = purl2;
    }

    public String getPurl3() {
        return purl3;
    }

    public void setPurl3(String purl3) {
        this.purl3 = purl3;
    }

    public String getPurl4() {
        return purl4;
    }

    public void setPurl4(String purl4) {
        this.purl4 = purl4;
    }

    public String getPurl5() {
        return purl5;
    }

    public void setPurl5(String purl5) {
        this.purl5 = purl5;
    }

    public String getPurl6() {
        return purl6;
    }

    public void setPurl6(String purl6) {
        this.purl6 = purl6;
    }

}


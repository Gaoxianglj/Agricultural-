package com.example.Agricultural.requestdto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PutArticlesForm {
    //用户ID
    @NotNull(message = "用户ID为空")
    Integer userId;
    //标题
    @NotBlank(message = "标题不能为空")
    String title;
    //详细内容
    String detail;

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
}

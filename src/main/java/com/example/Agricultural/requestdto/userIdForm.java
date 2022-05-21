package com.example.Agricultural.requestdto;

import javax.validation.constraints.NotNull;

public class userIdForm {
    //用户Id
    @NotNull(message = "用户Id不能为空")
    Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

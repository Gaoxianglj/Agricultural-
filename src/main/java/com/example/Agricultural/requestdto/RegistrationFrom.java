package com.example.Agricultural.requestdto;

import com.example.Agricultural.entity.User;

import javax.validation.constraints.NotBlank;

public class RegistrationFrom {
    //用户名
    @NotBlank(message = "用户名不能为空。")
    private String userName;
    //密码
    @NotBlank(message = "密码不能为空。")
    private String password;
    //确认密码
    @NotBlank(message = "确认密码不能为空。")
    private String confirmpassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
    public User forUser(){
        if(this.password.equals(this.confirmpassword)){
            User user=new User();
            user.setUserName(this.userName);
            user.setPassword(this.password);
            return user;
        }else {
            throw new RuntimeException("用户两遍输入密码不一致");
        }

    }
}

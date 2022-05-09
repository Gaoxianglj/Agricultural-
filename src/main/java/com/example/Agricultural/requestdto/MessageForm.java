package com.example.Agricultural.requestdto;

public class MessageForm {
    //发送用户
    String fromName;
    //接收用户
    String toName;
    //信息
    String message;
    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

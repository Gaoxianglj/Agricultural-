package com.example.Agricultural.controller;

import com.alibaba.fastjson.JSON;
import com.example.Agricultural.requestdto.MessageForm;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
@RestController
@ServerEndpoint("/websocket/{name}")
public class WebSocketServer {

    //存储客户端的连接对象,每个客户端连接都会产生一个连接对象
    private static ConcurrentHashMap<String,WebSocketServer> map=new ConcurrentHashMap();
    //每个连接都会有自己的会话
    private Session session;
    private String name;
    @OnOpen
    public void open(@PathParam("name") String name, Session session){

        map.put(name,this);
        System.out.println(name+"连接服务器成功");
        System.out.println("客户端连接个数:"+getConnetNum());

        this.session=session;
        this.name=name;
    }
    @OnClose
    public void close(){
        map.remove(name);
        System.out.println(name+"断开了服务器连接");
    }
    @OnError
    public void error(Throwable error){
        error.printStackTrace();
        System.out.println(name+"出现了异常");
    }
    @OnMessage
    public void getMessage(String message) throws IOException {
        System.out.println("收到"+name+":"+message);
        System.out.println("客户端连接个数:"+getConnetNum());
        MessageForm mom= JSON.parseObject(message,MessageForm.class);

        System.out.println(mom.getToName()+" wwwwwwwwwwwwwwwwwwww");
        Set<Map.Entry<String, WebSocketServer>> entries = map.entrySet();
        try{

         map.get(mom.getToName()).send(mom.getMessage());

        }
        catch(Exception e) {
            throw new RemoteException("无此用户");
        }


//        for (Map.Entry<String, WebSocketServer> entry : entries) {
//            if(!entry.getKey().equals(name)){//将消息转发到其他非自身客户端
//                entry.getValue().send(message);
//
//            }
//        }
    }

    public void send(String message) throws IOException {
        if(session.isOpen()){
            session.getBasicRemote().sendText(message);
        }
    }

    public int  getConnetNum(){
        return map.size();
    }
}
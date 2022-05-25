package com.example.Agricultural.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UpLoadController {

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file){
        return saveFile(file);
    }
    @PostMapping("/multiUpload")
    public List<String> multiUpload(@RequestParam("files")MultipartFile[] files){
        List<String> urlList=new ArrayList<String>();

        System.out.println("文件的个数:"+files.length);
        for (MultipartFile f : files){
            String filename=saveFile(f);
            urlList.add(filename);
        }
        return urlList;
    }

    private String saveFile(MultipartFile file){
        if (file.isEmpty()){
            throw new RuntimeException("无文件") ;
        }
        String filename = file.getOriginalFilename(); //获取上传文件原来的名称
        String filePath = "/home/ubuntu/assets/";//    /home/ubuntu/assets/
        File temp = new File(filePath);
        if (!temp.exists()){
            temp.mkdirs();
        }

        File localFile = new File(filePath+filename);
        try {
            file.transferTo(localFile); //把上传的文件保存至本地
            System.out.println(file.getOriginalFilename()+" 上传成功");
        }catch (IOException e){
            e.printStackTrace();
            return "上传失败";
        }

        return "http://43.138.15.210:8003/assets/"+filename;
    }
}

package com.example.Agricultural.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.Agricultural.requestdto.PutArticlesForm;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
@RestController
public class testupload {
    @RequestMapping ("/uploadFile")
    public void uploadFile(HttpServletRequest request, @RequestPart("formData") String formString) throws IOException {
        String str1 = new String(formString.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        System.out.println("StringJSON"+str1);
        PutArticlesForm form= JSONObject.parseObject(str1,PutArticlesForm.class);
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());


        commonsMultipartResolver.setDefaultEncoding("utf-8");

        if (commonsMultipartResolver.isMultipart(request)){
            MultipartHttpServletRequest mulReq = (MultipartHttpServletRequest) request;
            Map<String, MultipartFile> map = mulReq.getFileMap();

            // key为前端的name属性，value为上传的对象（MultipartFile）
            for (Map.Entry<String, MultipartFile> entry : map.entrySet()) {
                if(entry.getKey().equals("image")){
                    System.out.println(entry.getValue().getOriginalFilename()+"图片");
                }
               System.out.println(form.getUserId()+"信息");
                // 自己的保存文件逻辑
      //         saveOrUpdateImageFile(feedback.getId(), entry.getKey(), entry.getValue());
            }
        }


    }

}

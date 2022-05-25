package com.example.Agricultural.controller;

import com.example.Agricultural.exception.BusinessFailureException;
import com.example.Agricultural.requestdto.PutArticlesForm;
import com.example.Agricultural.service.UserPutService;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@RestController
public class UserPutController {
    @Resource
    UserPutService userPutService;
    /**
     * 用户发布文章内容。
     * <p>根据用户填写内容注册用户信息</p>
     *
     * @param form 用户ID,标题,详细内容。
     * @param errors 参数校验错误信息
     */
    @PostMapping("/user/putArticles")
    public void PutArticles( @RequestBody @Valid  PutArticlesForm form, Errors errors){
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }
        if(form.getPhotoUrls().size()<6){
            int i=form.getPhotoUrls().size();
            for(int a=0;a<i+2;a++){
                form.getPhotoUrls().add(null);
            }
            System.out.println("数量+2"+form.getPhotoUrls().size());
        }
        userPutService.PutArticles(form);
    }

}

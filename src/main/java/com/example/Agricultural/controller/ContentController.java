package com.example.Agricultural.controller;

import com.example.Agricultural.entity.Functional.ContentForHomePage;
import com.example.Agricultural.exception.BusinessFailureException;
import com.example.Agricultural.requestdto.userIdForm;
import com.example.Agricultural.service.ContentService;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class ContentController {
    @Resource
    ContentService contentService;
    /**
     * 查询所有内容。
     *
     * @return 内容串
     */
    @PostMapping("/content/all")
    public List<ContentForHomePage> SelectAllContent(){
        return contentService.SelectAllContent();
    }
    /**
     * 查询关注者内容。
     * @param form 用户Id
     * @return 内容串
     */
    @PostMapping("/content/concerned")
    public List<Map<String, List<ContentForHomePage>>> SelectUpContent(@RequestBody userIdForm form , Errors errors){
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }
          return contentService.SelectUpContent(form.getUserId());
    }
    /**
     * 查询自己发布的作品
     * @param form 用户Id
     * @return 内容串
     */
    @PostMapping("/content/SelfMade")
    public List<ContentForHomePage> SelectMyselfContent(@RequestBody userIdForm form , Errors errors){
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }
        return contentService.SelectMyselfContent(form.getUserId());
    }
}

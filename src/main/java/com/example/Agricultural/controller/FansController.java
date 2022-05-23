package com.example.Agricultural.controller;

import com.example.Agricultural.entity.User;
import com.example.Agricultural.exception.BusinessFailureException;
import com.example.Agricultural.requestdto.FansForm;
import com.example.Agricultural.requestdto.userIdForm;
import com.example.Agricultural.service.FansService;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class FansController {
    @Resource
    FansService fansService;

    /**
     *
     * @param form 用户id
     * @param errors 报错信息
     * @return 粉丝列表
     */
    @PostMapping("/fans/myfans")
    public List<User> MyFans(@RequestBody userIdForm form, Errors errors){
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }
       return fansService.MyFans(form.getUserId());
    }
    @PostMapping("/fans/focus")
    public List<Integer> myfocus(@RequestBody userIdForm form ,Errors errors)
    {
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }
        return fansService.myFocus(form.getUserId());
    }

    @PostMapping("/fans/addFocus")
    public void addFocus(@RequestBody FansForm form,Errors errors)
    {
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }
        fansService.addFocus(form);
    }

    @PostMapping("/fans/deleteFocus")
    public void deleteFocus(@RequestBody FansForm form,Errors errors)
    {
        if (errors.hasErrors()) {
            // 当form中存在验证错误，则抛出业务错误，将验证信息输出。
            throw new BusinessFailureException(errors);
        }
        fansService.deleteFocus(form);
    }
}

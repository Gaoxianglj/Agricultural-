package com.example.Agricultural.service.impl;

import com.example.Agricultural.dao.UserDao;
import com.example.Agricultural.entity.User;
import com.example.Agricultural.requestdto.FansForm;
import com.example.Agricultural.service.FansService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Service
public class FansServiceImpl implements FansService {
    @Resource
    com.example.Agricultural.dao.fansDao fansDao;
    @Resource
    UserDao userDao;

    /**
     * 查询关注你的人
     * @param userId 用户id
     * @return 关注你的人的列表
     */
    @Override
    public List<User> MyFans(Integer userId) {
        List<User> userList=new ArrayList<>();
        if(fansDao.SelectFansUserIdList(userId).size()<=0){
            throw new RuntimeException("还没有人关注你");
        }
       List<String> fansUserIdList=fansDao.SelectFansUserIdList(userId);
        for(String fansUserId:fansUserIdList){
            User user=userDao.SelectUserForId(Integer.valueOf(fansUserId));
            user.setPassword(null);
            userList.add(user);
        }
        return userList;
    }

    @Override
    public List<Integer> myFocus(Integer userId) {
        return fansDao.selectedMyFocus(userId);
    }

    @Override
    public void addFocus(FansForm form) {
        fansDao.addFocus(form);
    }

    @Override
    public void deleteFocus(FansForm form) {
        fansDao.deleteFocus(form);
    }
}

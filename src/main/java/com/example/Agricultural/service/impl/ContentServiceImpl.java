package com.example.Agricultural.service.impl;

import com.example.Agricultural.dao.UserDao;
import com.example.Agricultural.dao.contentDao;
import com.example.Agricultural.dao.fansDao;
import com.example.Agricultural.entity.Functional.ContentForHomePage;
import com.example.Agricultural.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ContentServiceImpl implements ContentService {

    @Resource
    contentDao contentDao;
    @Resource
    fansDao fansDao;
    @Resource
    UserDao userDao;
    /**
     * 查询所有内容。
     *
     * @return 内容串
     */
    @Override
    public List<ContentForHomePage> SelectAllContent() {
        return contentDao.SelectAllContent();
    }
    /**
     * 查询关注者内容。
     * @param userId 用户Id
     * @return 内容串
     */
    @Override
    public List<ContentForHomePage> SelectUpContent(Integer userId) {
        //获得关注人列表
        List<String> UPUserIdList=new ArrayList<>();
        if(fansDao.SelectUpUserIdList(userId).size()>0){
         UPUserIdList= fansDao.SelectUpUserIdList(userId);}
        else {throw new RuntimeException("无关注人");}
        System.out.println("关注人名单"+UPUserIdList);
        List<ContentForHomePage> contentForHomePageList=new ArrayList<>();
        for(String UpUserId:UPUserIdList){
           contentForHomePageList.addAll(contentDao.SelectUpContent(Integer.valueOf(UpUserId))) ;

        }
        return contentForHomePageList;
    }
    /**
     * 查询自己发布的作品
     * @param userId 用户Id
     * @return 内容串
     */
    @Override
    public List<ContentForHomePage> SelectMyselfContent(Integer userId){
        return contentDao.SelectUpContent(userId);
    }

    @Override
    public Integer getAllLikenum(Integer userId) {
        return contentDao.getAllLikenum(userId);
    }
}

package com.example.Agricultural.service;

import com.example.Agricultural.entity.Functional.ContentForHomePage;

import java.util.List;
import java.util.Map;

public interface ContentService {
    /**
     * 查询所有内容。
     *
     * @return 内容串
     */
    public List<ContentForHomePage> SelectAllContent();
    /**
     * 查询关注者内容。
     * @param userId 用户Id
     * @return 内容串
     */
    public List<Map<String,List<ContentForHomePage>>> SelectUpContent(Integer userId);
    /**
     * 查询自己发布的作品
     * @param userId 用户Id
     * @return 内容串
     */
    List<ContentForHomePage> SelectMyselfContent(Integer userId);

    Integer getAllLikenum(Integer userId);

    int addLikeNum(Integer contentId);
}

package com.example.Agricultural.dao;

import com.example.Agricultural.entity.Functional.ContentForHomePage;
import com.example.Agricultural.requestdto.PutArticlesForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface contentDao {
    /**
     * 用户发布文章内容。
     * <p>根据用户填写内容新增一条内容表数据</p>
     *
     * @param form 用户ID,标题,详细内容。
     * @param url 视频存储地址
     * @param time 发布时间
     */
    public int insertToArticles(@Param("form") PutArticlesForm form,@Param("releaseTime") LocalDateTime time,@Param("url")String url);

    /**
     * 查询所有内容。
     *
     * @return 内容串
     */
    public List<ContentForHomePage> SelectAllContent();

    /**
     * 查询其关注者的视频内容
     */
    public List<ContentForHomePage> SelectUpContent(@Param("UpUserId")Integer UpUserId);

    Integer getAllLikenum(Integer userId);
    int addLikeNum(Integer contentId);
}

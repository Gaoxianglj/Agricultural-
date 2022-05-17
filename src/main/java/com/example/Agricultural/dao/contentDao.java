package com.example.Agricultural.dao;

import com.example.Agricultural.requestdto.PutArticlesForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
@Mapper
public interface contentDao {
    /**
     * 用户发布文章内容。
     * <p>根据用户填写内容新增一条内容表数据</p>
     *
     * @param form 用户ID,标题,详细内容。
     * @param time 发布时间
     */
    public int insertToArticles(@Param("form") PutArticlesForm form,@Param("releaseTime") LocalDateTime time);
}

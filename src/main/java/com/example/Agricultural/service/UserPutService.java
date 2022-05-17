package com.example.Agricultural.service;

import com.example.Agricultural.requestdto.PutArticlesForm;

public interface UserPutService {
   /**
    * 用户发布文章内容。
    * <p>根据用户填写内容新增一条内容表数据</p>
    *
    * @param form 用户ID,标题,详细内容。
    */
   public void PutArticles(PutArticlesForm form);
}

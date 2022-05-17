package com.example.Agricultural.service.impl;

import com.example.Agricultural.dao.contentDao;
import com.example.Agricultural.requestdto.PutArticlesForm;
import com.example.Agricultural.service.UserPutService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
public class UserPutServiceImpl implements UserPutService {
    @Resource
    contentDao contentDao;
    /**
     * 用户发布文章内容。
     * <p>根据用户填写内容新增一条内容表数据</p>
     *
     * @param form 用户ID,标题,详细内容。
     */
    @Override
    public void PutArticles(PutArticlesForm form) {
      int message=contentDao.insertToArticles(form, LocalDateTime.now());
      if(message<=0){
          throw new RuntimeException("数据库出错,添加失败");
      }
    }
}

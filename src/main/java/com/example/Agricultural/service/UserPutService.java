package com.example.Agricultural.service;

import com.example.Agricultural.requestdto.PutArticlesForm;
import org.springframework.web.multipart.MultipartFile;

public interface UserPutService {
   /**
    * 用户发布文章内容。
    * <p>根据用户填写内容注册用户信息</p>
    *
    * @param form 用户ID,标题,详细内容。
    * @param videoFile 视频文件
    * @param photoFiles 照片文件（多文件）
    */
   public void PutArticles(PutArticlesForm form,MultipartFile videoFile, MultipartFile[] photoFiles);
}

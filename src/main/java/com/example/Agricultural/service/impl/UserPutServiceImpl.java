package com.example.Agricultural.service.impl;

import com.example.Agricultural.dao.contentDao;
import com.example.Agricultural.dao.contentphotoDao;
import com.example.Agricultural.entity.Contentphoto;
import com.example.Agricultural.requestdto.PutArticlesForm;
import com.example.Agricultural.service.UserPutService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserPutServiceImpl implements UserPutService {
    @Resource
    contentDao contentDao;
    @Resource
    contentphotoDao contentphotoDao;
    /**
     * 用户发布文章内容。
     * <p>根据用户填写内容注册用户信息</p>
     *
     * @param form 用户ID,标题,详细内容。
     */
    @Override
    public void PutArticles(PutArticlesForm form) {
     System.out.println("id\n"+form.getUserId()+"\n标题\n"+form.getDetail()+"\n内容\n"+form.getDetail());
      int contentId=contentDao.insertToArticles(form, LocalDateTime.now(),form.getVideoUrl());
      System.out.println("contentId"+form.getUserId());
        Contentphoto contentphoto=new Contentphoto();
        contentphoto.setContentId(form.getUserId());contentphoto.setPurl1(form.getPhotoUrls().get(0));contentphoto.setPurl2(form.getPhotoUrls().get(1));contentphoto.setPurl3(form.getPhotoUrls().get(2));contentphoto.setPurl4(form.getPhotoUrls().get(3));contentphoto.setPurl5(form.getPhotoUrls().get(4));contentphoto.setPurl6(form.getPhotoUrls().get(5));
System.out.println("contentphoto的Id"+contentphoto.getContentId()+"url"+contentphoto.getPurl1());
      int message=contentphotoDao.insert(form.getUserId(), contentphoto);

      if(message<=0){
          throw new RuntimeException("数据库出错,添加失败");
      }
    }

    public List<String> multiUpload(MultipartFile[] files){
        List<String> urlList=new ArrayList<String>();

        System.out.println("文件的个数:"+files.length);
        for (MultipartFile f : files){
           String filename=saveFile(f);
           urlList.add(filename);
        }
        for(int a=0;a<11-urlList.size();a++){
            urlList.add(null);
        }
        return urlList;
    }

    private String saveFile(MultipartFile file){
        if (file.isEmpty()){
            throw new RuntimeException("无文件") ;
        }
        String filename = file.getOriginalFilename(); //获取上传文件原来的名称
        String filePath = "/home/ubuntu/assets/";//    /home/ubuntu/assets/
        File temp = new File(filePath);
        if (!temp.exists()){
            temp.mkdirs();
        }

        File localFile = new File(filePath+filename);
        try {
            file.transferTo(localFile); //把上传的文件保存至本地
            System.out.println(file.getOriginalFilename()+" 上传成功");
        }catch (IOException e){
            e.printStackTrace();
            return "上传失败";
        }

        return "http://43.138.15.210:8003/assets/"+filename;
    }
}

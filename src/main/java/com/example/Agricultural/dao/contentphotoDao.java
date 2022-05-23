package com.example.Agricultural.dao;

import com.example.Agricultural.entity.Contentphoto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface contentphotoDao {
    /**
     *
      * @param id 作品id
     * @param contentphoto 图片存储类
     * @return 验证
     */
    public int insert(@Param("Id")int id,@Param("contentphoto")Contentphoto contentphoto);
}

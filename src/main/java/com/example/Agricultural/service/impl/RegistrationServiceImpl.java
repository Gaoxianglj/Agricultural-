package com.example.Agricultural.service.impl;

import com.example.Agricultural.dao.UserDao;
import com.example.Agricultural.entity.User;
import com.example.Agricultural.service.RegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Resource
    UserDao userDao;
    /**
     * 用户注册。
     * <p>根据用户填写内容注册用户信息</p>
     *
     * @param user 用户信息
     */
    @Override
    public void Registration(User user) {
      int yn=userDao.registration(user);
      if(yn<=0){
          throw new RuntimeException("数据库新增出现问题，请联系后台负责人");
      }

    }
}

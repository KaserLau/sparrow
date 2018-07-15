package com.better.sparrow.service;

import com.better.sparrow.entity.UserEntity;
import com.better.sparrow.repository.MyBatisUserRespository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 3:38 PM 2018/7/15
 * @Modified By :
 */
public class MyBatisUserService {
    @Resource
    private MyBatisUserRespository myBatisUserRespository;

    @Transactional
    public int insertUser(UserEntity user){
        return myBatisUserRespository.insertUser(user);
    }

    @Transactional
    public void insertGetKey(UserEntity user){
        myBatisUserRespository.insertGetKey(user);
    }

    public UserEntity selectByUserName(String userName){
        return myBatisUserRespository.selectByUserName(userName);
    }

    public List<UserEntity> findAll(){
        return myBatisUserRespository.findAll();
    }

    public UserEntity findUserById(int id){
        return myBatisUserRespository.findUserById(id);
    }

    @Transactional
    public void delete(final Integer id){
        myBatisUserRespository.delete(id);
    }

    @Transactional
    public void update(final UserEntity user){
        myBatisUserRespository.update(user);
    }

}

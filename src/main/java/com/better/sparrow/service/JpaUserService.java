package com.better.sparrow.service;

import com.better.sparrow.entity.UserEntity;
import com.better.sparrow.repository.JpaUserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @Author : yaobin.a.liu
 * @Description : Database operation(CRUD)，All operations need to add transaction processing except the query
 * @Date : Create in 6:42 PM 7/13/2018
 * @Modified By :
 */

@Service
public class JpaUserService {
    @Resource
    private JpaUserRepository jpaUserRepository;

    @Transactional
    public UserEntity save(UserEntity user){
        return jpaUserRepository.save(user);
    }

    @Transactional
    public void delete(int id){
        jpaUserRepository.deleteById(id);
    }

    public Iterable<UserEntity> readAll(){
        return jpaUserRepository.findAll();
    }

    public UserEntity readdById(int id){
        Optional<UserEntity> op = jpaUserRepository.findById(id);
        return op.get();
    }

    @Transactional
    public UserEntity update(int id,UserEntity user){
        user.setId(id);
        user.setAge(user.getAge());
        user.setSex(user.getSex());
        user.setUserName(user.getUserName());
        user.setLoginName(user.getLoginName());
        return jpaUserRepository.save(user);
    }
}

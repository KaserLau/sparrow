package com.better.sparrow.controller;

import com.better.sparrow.entity.UserEntity;
import com.better.sparrow.service.MyBatisUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 3:47 PM 2018/7/15
 * @Modified By :
 */
@RestController
@RequestMapping(value = "/mybatis/user")
public class MyBatisUserController {
    @Resource
    private MyBatisUserService myBatisUserService;

    @PostMapping(value ="/insert", produces = "application/json")
    public int insertUser(UserEntity user){
        return myBatisUserService.insertUser(user);
    }

    @PostMapping(value = "/insertGetKey",produces = "application/json")
    public void insertGetKey(UserEntity user){
        myBatisUserService.insertGetKey(user);
    }

    @GetMapping(value = "/selectByUserName/{userName}")
    public UserEntity selectByUserName(@PathVariable String userName){
        return myBatisUserService.selectByUserName(userName);
    }

    @GetMapping(value = "/selectAll")
    public List<UserEntity> findAll(){
        return myBatisUserService.findAll();
    }

    @GetMapping(value = "/selectById/{id}")
    public UserEntity findUserById(@PathVariable int id){
        return myBatisUserService.findUserById(id);
    }

    @GetMapping(value = "/deleteById/{id}")
    public void delete(final Integer id){
        myBatisUserService.delete(id);
    }

    @PutMapping(value = "/updateUser")
    public void update(final UserEntity user){
        myBatisUserService.update(user);
    }
}

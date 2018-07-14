package com.better.sparrow.controller;

import com.better.sparrow.entity.UserEntity;
import com.better.sparrow.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author : yaobin.a.liu
 * @Description :
 * @Date : Create in 6:53 PM 7/13/2018
 * @Modified By :
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/save")
    public String save(){
        UserEntity user = new UserEntity();
        user.setAge(18);
        user.setSex('男');
        user.setLoginName("testone");
        user.setUserName("player");
        userService.save(user);
        return "保存数据成功";
    }

    @GetMapping("/selectAll")
    public Iterable<UserEntity> readAll(){
        return userService.readAll();
    }

    @GetMapping("/selectById")
    public UserEntity readdById(){
        int id = 1;
        return userService.readdById(id);
    }

    @PutMapping("/update")
    public void update(UserEntity user){
    }
}

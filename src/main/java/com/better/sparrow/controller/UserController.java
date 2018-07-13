package com.better.sparrow.controller;

import com.better.sparrow.entity.UserEntity;
import com.better.sparrow.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/save")
    public String save(){
        UserEntity user = new UserEntity();
        user.setAge(18);
        user.setSex('男');
        user.setLoginName("testone");
        user.setUsername("player");
        return "保存数据成功";
    }
}

package com.better.sparrow.controller;

import com.better.sparrow.entity.UserEntity;
import com.better.sparrow.service.JpaUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author : yaobin.a.liu
 * @Description :
 * @Date : Create in 6:53 PM 7/13/2018
 * @Modified By :
 */
@RestController
@RequestMapping("/jpa/user")
public class JpaUserController {
    @Resource
    private JpaUserService jpaUserService;

    /**
     * @Author: Kaser.Lau
     * @Date: 2018/7/15
     * @Description: insert data using post mapping
     * @Param:
     * @return:
     **/
    @PostMapping(value = "/save",produces = "application/json")
    public String save(@RequestBody UserEntity user){
        jpaUserService.save(user);
        return "保存数据成功";
    }

    /**
     * @Author: Kaser.Lau
     * @Date: 2018/7/15
     * @Description: Get data using get mapping
     * @Param:
     * @return:
     **/
    @GetMapping("/selectAll")
    public Iterable<UserEntity> readAll(){
        return jpaUserService.readAll();
    }
    /**
     * @Author: Kaser.Lau
     * @Date: 2018/7/15
     * @Description: Get data using get mapping
     * @Param:
     * @return:
     **/
    @GetMapping("/selectById")
    public UserEntity readdById(@RequestParam("id") int id){
        return jpaUserService.readdById(id);
    }

    /**
     * @Author: Kaser.Lau
     * @Date: 2018/7/15
     * @Description: update data using put mapping
     * @Param:
     * @return:
     **/
    @PutMapping("/update")
    public void update(@RequestParam("id") int id,
                       @RequestBody UserEntity user){
        jpaUserService.update(id,user);
    }
    
    /** 
     * @Author: Kaser.Lau
     * @Date: 2018/7/15 
     * @Description: 
     * @Param:  
     * @return:  
     **/ 
    @GetMapping("/delete")
    public void delete(@RequestParam("id") int id){
        jpaUserService.delete(id);
    }
}

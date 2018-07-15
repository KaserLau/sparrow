package com.better.sparrow.repository;

import com.better.sparrow.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author : Kaser.Lau
 * @Description :
 * @Create Date : 3:07 PM 2018/7/15
 * @Modified By :
 */
public interface MyBatisUserRespository {

    @Insert("insert into tb_user(age,login_name,sex,user_name)"+"values(#{age},#{loginName},#{sex},#{userName})")
    int insertUser(UserEntity user);

    @Insert("insert into tb_user(age,login_name,sex,user_name)"+"values(#{age},#{loginName},#{sex},#{userName})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void insertGetKey(UserEntity user);

    @Select("select * from tb_user where user_name = #{userName}")
    @ResultMap("userResult")
    UserEntity selectByUserName(@Param("userName") String userName);

    @Select("select * from tb_user")
    @Results(id = "userResult",value = {
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "age",property = "age"),
            @Result(column = "login_name",property = "loginName"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "user_name",property = "userName"),
    })
    List<UserEntity> findAll();

    @Delete("delete from tb_user where id = #{id}")
    void delete(final Integer id);

    @Select("select * from tb_user where id = #{id}")
    @ResultMap("userResult")
    UserEntity findUserById(int id);

    @Update("update tb_user set user_name = #{userName},login_name = #{loginName} where id = #{id}")
    void update(final UserEntity user);
}

package com.better.sparrow.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author : yaobin.a.liu
 * @Description :
 * @Date : Create in 5:58 PM 7/13/2018
 * @Modified By :
 */
@Entity
@Table(name = "tb_user")
@Setter
@Getter
@ToString
@EqualsAndHashCode
//@Data
//该注解使用在类上，该注解是最常用的注解，它结合了@ToString，@EqualsAndHashCode， @Getter和@Setter。
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String loginName;
    private String sex;
    private int age;
}

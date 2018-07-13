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
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String loginName;
    private char sex;
    private int age;
}

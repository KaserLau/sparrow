package com.better.sparrow.repository;

import com.better.sparrow.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author : yaobin.a.liu
 * @Description :
 * @Date : Create in 6:41 PM 7/13/2018
 * @Modified By :
 */
public interface JpaUserRepository extends CrudRepository<UserEntity,Integer> {
}

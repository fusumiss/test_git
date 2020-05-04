package com.myself.mapper;

import com.myself.pojo.User;

import java.util.List;

/**
 * Create By   on
 */

public interface UserMapper {

    /**
     * mybatis 提供简单的注解形式，可以实现单表查询
     * @return
     */
   // @Select("select * from tb_brand")
    List<User> findAll();
}

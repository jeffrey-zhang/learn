package com.trendmicro.HelloWorld.dao;

import java.util.List;

import com.trendmicro.HelloWorld.bean.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    /**
     * 查询所有用户
     */
    @Select("SELECT id,name,age FROM t_user")     
    List<User> findAll();
}

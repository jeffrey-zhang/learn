package com.trendmicro.HelloWorld.service;

import java.util.List;

import com.trendmicro.HelloWorld.bean.User;

public interface UserService {
    /**
 * 查询所有
 * @return
 */
 List<User> findAll();
}

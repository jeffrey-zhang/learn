package com.trendmicro.examamanda.dao;

import com.trendmicro.examamanda.entity.User;

public interface UserDao {
    // 登录
    User login(String username, String password);

}

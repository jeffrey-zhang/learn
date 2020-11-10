package com.trendmicro.restfulcrud.dao;

import com.trendmicro.restfulcrud.entity.User;

public interface UserDao {

    User getUser(String username, String password);

    // public void insertUser(User user);

}

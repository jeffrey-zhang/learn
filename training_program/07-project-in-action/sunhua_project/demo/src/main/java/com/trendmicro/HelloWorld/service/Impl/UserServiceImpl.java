package com.trendmicro.HelloWorld.service.Impl;

import java.util.List;

import com.trendmicro.HelloWorld.bean.User;
import com.trendmicro.HelloWorld.dao.UserDao;
import com.trendmicro.HelloWorld.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    
}

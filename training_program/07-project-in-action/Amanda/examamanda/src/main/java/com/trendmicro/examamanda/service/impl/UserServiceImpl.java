package com.trendmicro.examamanda.service.impl;

import javax.annotation.Resource;

import com.trendmicro.examamanda.dao.UserDao;
import com.trendmicro.examamanda.entity.User;
import com.trendmicro.examamanda.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    // 植入dao层对象
    @Resource
    UserDao dao;

    @Override
    public User login(String username, String password) {
        return dao.login(username, password);
    }
}

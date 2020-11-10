package com.trendmicro.restfulcrud.service.impl;

import javax.annotation.Resource;

import com.trendmicro.restfulcrud.dao.UserDao;
import com.trendmicro.restfulcrud.entity.User;
import com.trendmicro.restfulcrud.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public User getUser(String username, String password) {

        return userDao.getUser(username, password);
    }

}

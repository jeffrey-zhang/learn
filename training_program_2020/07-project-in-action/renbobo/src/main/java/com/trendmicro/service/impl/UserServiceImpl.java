package com.trendmicro.service.impl;

import com.trendmicro.dao.UserDao;
import com.trendmicro.dto.AvgDTO;
import com.trendmicro.dto.StudentAndScoreDTO;
import com.trendmicro.entity.User;
import com.trendmicro.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserByNameAndPassword(String username, String password) {
        return userDao.findUserByNameAndPassword(username,password);
    }

    @Override
    public AvgDTO showAvg() {
        return userDao.showAvg();

    }

    @Override
    public List<User> selectUserByName(String username) {
        return userDao.selectUserByName(username);
    }
}

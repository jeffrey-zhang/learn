package com.trendmicro.service;

import com.trendmicro.dto.AvgDTO;
import com.trendmicro.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();

    User findUserByNameAndPassword(String username, String password);

    AvgDTO showAvg();

    List<User> selectUserByName(String username);
}

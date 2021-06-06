package com.trendmicro.examamanda.service;

import com.trendmicro.examamanda.entity.User;

public interface UserService {
    User login(String username, String password);
}

package com.trendmicro.restfulcrud.service;

import com.trendmicro.restfulcrud.entity.User;

public interface UserService {
    User getUser(String username, String password);

}

package com.trendmicro.restfulcrud.controller;

import javax.annotation.Resource;

import com.trendmicro.restfulcrud.service.UserService;
import com.trendmicro.restfulcrud.entity.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/login")
    @ResponseBody
    public String login(String username, String password) {

        if (username != null && password != null) {
            User user = userService.getUser(username, password);
            if (user != null) {
                return "ok";
            }

        }
        return "error";
    }

}

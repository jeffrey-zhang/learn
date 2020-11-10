package com.trendmicro.examamanda.controller;

import javax.annotation.Resource;

import com.trendmicro.examamanda.entity.User;
import com.trendmicro.examamanda.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping("/loginVerify")
    @ResponseBody
    @CrossOrigin
    public String loginVerify(String username, String password) {
        User loginuser = userService.login(username, password);
        if (loginuser.getUserName() == null) {
            System.out.println(loginuser);
            // return ("attempting to log in with the non-existed account");
            return "该用户不存在";
        } else {

            return "login";
        }
    }

}

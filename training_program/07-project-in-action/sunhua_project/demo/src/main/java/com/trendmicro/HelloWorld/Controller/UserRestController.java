package com.trendmicro.HelloWorld.Controller;

import java.util.List;

import com.trendmicro.HelloWorld.bean.User;
import com.trendmicro.HelloWorld.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {
    @Autowired
    private UserService userService;

    @GetMapping(value="/userAll")
    public List<User> findByUserAge () {
        System.out.println("开始查询所有数据。。。");
        return userService.findAll();
    }
    
}

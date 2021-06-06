package com.trendmicro.controller;

import com.trendmicro.dto.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 配置首页 当访问localhost：8080时默认跳转到login页面
 */

@Controller
public class FirstController {


    @RequestMapping("/")
    public String first() {

        return "login.html";
    }

}
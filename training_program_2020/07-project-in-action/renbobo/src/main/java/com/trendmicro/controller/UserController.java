package com.trendmicro.controller;

import com.trendmicro.dao.UserDao;
import com.trendmicro.dto.AvgDTO;
import com.trendmicro.dto.R;
import com.trendmicro.entity.User;
import com.trendmicro.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * User相关操作都早这个controller
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 登陆操作
     *
     * @param username
     * @param password
     * @return
     */
    @PostMapping(value = "/login")
    public R login( String username,String password) {
        R r = new R();
        if ((username != null && username != "") & (password != null && password != "")) {
            User user = userService.findUserByNameAndPassword(username, password);
            if (user != null) {
                r.setCode(200);
                r.setMsg("success");
            } else {
                r.setCode(400);
                r.setMsg("账号或密码错误");
            }
        } else {
            r.setCode(400);
        }
        return r;
    }

    /**
     * 展示所有的用户的姓名及密码
     *
     * @return
     */
    @RequestMapping("user")
    public  List<User> home() {
        List<User> users = userService.findAllUser();
       return users;
    }

    @ResponseBody
    @GetMapping("avg")
    public R showAvg() {
        R r  =new R(200,"",userService.showAvg());
        return r;
    }

    @RequestMapping("selectUser")
    public List<User> selectUserByName(String username){
        if (username!=null && username !=""){
            List<User> users = userService.selectUserByName(username);
            return users;
        }else {
            return userService.findAllUser();
        }
    }


}

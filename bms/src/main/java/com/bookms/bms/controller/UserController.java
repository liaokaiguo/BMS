package com.bookms.bms.controller;

import com.alibaba.fastjson.JSON;
import com.bookms.bms.bean.User;
import com.bookms.bms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/insertUser")
    public String insertUser(@RequestBody User user){
        System.out.println(user);
        return JSON.toJSONString(userService.insertUser(user));
    }

    @PostMapping("/login")
    public  String login(@RequestBody User user, HttpServletRequest request){
        User user1 = userService.login(user);
        System.out.println(request.getSession());
        if(user1 != null){
            return JSON.toJSONString("登录成功");
        }else {
            return JSON.toJSONString("登录失败");
        }
    }
}

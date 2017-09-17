package com.ctx.spring.demo.controller;

import com.ctx.spring.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 */
@RestController("/test")
public class TestController {

    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setUserName("漳卅你");
        user.setPassword("1234566");
        user.setSex("男");
        return user;
    }

}

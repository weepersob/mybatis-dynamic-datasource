package com.mqw.mybatisdbshiftdemo.controller;

import com.mqw.mybatisdbshiftdemo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getCustomerById")
    public void getCustomerById(Long id) {
        userService.getCustomerById(id);
    }
    @RequestMapping("/getTagById")
    public void getTagById(Long id) {
        userService.getTagById(id);
    }
}

package com.imooc.house.controller;

import com.imooc.house.model.User;
import com.imooc.house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}

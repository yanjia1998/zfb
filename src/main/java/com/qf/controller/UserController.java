package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BaseResp login(@RequestBody User user){
        return userService.login(user);
    }

    @RequestMapping(value = "/registry",method = RequestMethod.POST)
    public BaseResp registry(@RequestBody User user){
        return userService.registry(user);
    }
}

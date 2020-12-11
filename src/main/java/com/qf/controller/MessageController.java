package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Wang on 2020/12/9 20:53
 */
@RequestMapping("message")
@RestController
@CrossOrigin
public class MessageController {

    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResp findAll(){
        return messageService.findAll();
    }
}


package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/express")
@CrossOrigin
public class ExpressController {
    @Autowired
    ExpressService expressService;
    @RequestMapping(value = "findByExpressId",method = RequestMethod.GET)
    public BaseResp findByExpressId( String expressid){
        return expressService.findByExpressid(expressid);
    }
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public BaseResp findAll(){
        return expressService.findAll();
    }
    @RequestMapping(value = "findByType",method = RequestMethod.GET)
    public BaseResp findByType(String type){
        return expressService.findByType(type);
    }
}

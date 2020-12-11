package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/goods")
@CrossOrigin
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public BaseResp findAll(){

        return goodsService.findAll();
    }

    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public BaseResp findById(@RequestBody Map map){
        return goodsService.findById((Integer)map.get("id"));
    }


    @RequestMapping(value = "/findByType",method = RequestMethod.POST)
    public BaseResp findByType(@RequestBody Map map){
        return goodsService.findByType(map.get("type").toString());
    }


    @RequestMapping(value ="/findByLike", method = RequestMethod.POST)
    public BaseResp findByLike(@RequestBody  Map map){
        return goodsService.findByLike((map.get("name").toString()));
    }
}

package com.qf.controller;

import com.qf.common.BaseResp;
import com.qf.pojo.Order;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "findByUid",method = RequestMethod.POST)
    public BaseResp findByUid(@RequestBody Map map){
        return orderService.findByUid((Integer)map.get("uid"));
    }
    @RequestMapping(value = "/updateAdd",method = RequestMethod.POST)
    public BaseResp updateAdd(@RequestBody Map map){
        return orderService.updateAdd((Integer)map.get("uid"),(Integer)map.get("gid"),(Integer)map.get("number"));
    }
    @RequestMapping(value = "/updateDown",method = RequestMethod.POST)
    public BaseResp updateDown (@RequestBody Order order){
        return orderService.updateDown(order);
    }
}

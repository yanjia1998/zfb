package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.OrderMapper;
import com.qf.pojo.Order;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderRepository;

    @Override
    public BaseResp findByUid(Integer uid) {
        List<Order> byUid = orderRepository.findByUid(uid);
        BaseResp baseResp = new BaseResp();
        if(byUid != null){

            baseResp.setData(byUid);
            baseResp.setCode(200);
            baseResp.setMessage("订单查询成功");
        }else{
            baseResp.setCode(201);
            baseResp.setMessage("订单查询失败");
        }
        return baseResp;
    }

    @Override
    public BaseResp updateAdd(Integer uid, Integer gid,Integer number) {
        Integer integer = orderRepository.updateAdd(uid, gid,number);
        BaseResp baseResp = new BaseResp();
        if(integer>0){
            baseResp.setMessage("数量增加成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("数量增加失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp updateDown(Order order) {
        Integer integer = orderRepository.updateDown(order);
        BaseResp baseResp = new BaseResp();
        if(integer>0){
            baseResp.setMessage("数量减少成功");
            baseResp.setCode(200);
        }else {
            baseResp.setMessage("数量减少失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }
}

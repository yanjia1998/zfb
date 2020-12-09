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
}

package com.qf.service;

import com.qf.common.BaseResp;
import com.qf.pojo.Order;

public interface OrderService {
    BaseResp findByUid(Integer uid);

    BaseResp updateAdd(Integer uid, Integer gid,Integer number);

    BaseResp updateDown(Order order);
}

package com.qf.service;

import com.qf.common.BaseResp;

import java.util.Map;

public interface GoodsService {
    BaseResp findAll();

    BaseResp findById(Integer id);

    BaseResp findByType(String type);

    BaseResp findByLike(String name);
}

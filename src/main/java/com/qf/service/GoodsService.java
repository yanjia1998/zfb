package com.qf.service;

import com.qf.common.BaseResp;

public interface GoodsService {
    BaseResp findAll();

    BaseResp findById(Integer id);
}

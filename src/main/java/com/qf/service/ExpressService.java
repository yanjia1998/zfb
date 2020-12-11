package com.qf.service;

import com.qf.common.BaseResp;

public interface ExpressService {
    BaseResp findByExpressid(String expressid);

    BaseResp findAll();

    BaseResp findByType(String type);
}

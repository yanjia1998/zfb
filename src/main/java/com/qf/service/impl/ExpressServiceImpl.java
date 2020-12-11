package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.ExpressRepsitory;
import com.qf.pojo.Express;
import com.qf.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressServiceImpl implements ExpressService {
    @Autowired
    ExpressRepsitory expressRepsitory;


    @Override
    public BaseResp findByExpressid(String expressid) {
        Express express = expressRepsitory.findByExpressid(expressid);
        BaseResp baseResp = new BaseResp();
        if(express != null ){
            baseResp.setMessage("查询成功");
            baseResp.setCode(200);
            baseResp.setData(express);
        }else {
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }

        return baseResp;    }

    @Override
    public BaseResp findAll() {
        List<Express> all = expressRepsitory.findAll();
        BaseResp baseResp = new BaseResp();
        if(all!= null){
            baseResp.setCode(200);
            baseResp.setMessage("查询成功");
            baseResp.setData(all);
        }else {
            baseResp.setCode(201);
            baseResp.setMessage("查询失败");
        }
        return baseResp;
    }

    @Override
    public BaseResp findByType(String type) {
        List<Express> byTypeOne = expressRepsitory.findByType(type);
        BaseResp baseResp = new BaseResp();
        if(byTypeOne!= null){
            baseResp.setCode(200);
            baseResp.setMessage("查询成功");
            baseResp.setData(byTypeOne);
        }else {
            baseResp.setCode(201);
            baseResp.setMessage("查询失败");
        }
        return baseResp;
    }
}

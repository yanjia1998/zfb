package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.GoodsRepository;
import com.qf.pojo.Goods;
import com.qf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsRepository goodsRepository;

    @Override
    public BaseResp findAll() {
        BaseResp baseResp = new BaseResp();
        List<Goods> all = goodsRepository.findAll();
        if(all != null){
            baseResp.setMessage("查询所有成功");
            baseResp.setCode(200);
            baseResp.setData(all);
        }else{
            baseResp.setMessage("查询所有失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp findById(Integer id) {
        Optional<Goods> byId = goodsRepository.findById(id);
        BaseResp baseResp = new BaseResp();
        if(byId.isPresent()){
            baseResp.setCode(200);
            baseResp.setData(byId.get());
            baseResp.setMessage("查询一个成功");
        }else{
            baseResp.setCode(201);
            baseResp.setMessage("查询一个失败");
        }
        return baseResp;
    }
}

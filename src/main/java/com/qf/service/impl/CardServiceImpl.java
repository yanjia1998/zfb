package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.CardRepository;
import com.qf.pojo.Card;
import com.qf.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public BaseResp findAll() {
        List<Card> all = cardRepository.findAll();
        BaseResp baseResp = new BaseResp();
        baseResp.setCode(200);
        baseResp.setMessage("查询所有成功");
        baseResp.setData(all);
        return baseResp;
    }
}

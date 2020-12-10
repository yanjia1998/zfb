package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.MessageRepository;
import com.qf.pojo.Goods;
import com.qf.pojo.Message;
import com.qf.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wang on 2020/12/9 20:51
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageRepository messageRepository;


    @Override
    public BaseResp findAll() {
        BaseResp baseResp = new BaseResp();
        List<Message> all = messageRepository.findAll();
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
}

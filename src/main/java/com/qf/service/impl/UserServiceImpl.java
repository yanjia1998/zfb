package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.UserRepository;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public BaseResp login(User user) {
        BaseResp baseResp = new BaseResp();

            User byNameAndPassword = userRepository.findByNameAndPassword(user.getName(), user.getPassword());
            if(byNameAndPassword != null){
                baseResp.setData(byNameAndPassword);
                baseResp.setCode(200);
                baseResp.setMessage("登录成功");
                return baseResp;
            }else{
                baseResp.setCode(201);
                baseResp.setMessage("登录失败");
                return baseResp;
        }
    }

    @Override
    public BaseResp registry(User user) {
        User user1 = userRepository.saveAndFlush(user);
        BaseResp baseResp = new BaseResp();
        baseResp.setCode(200);
        baseResp.setMessage("注册成功");
        return  baseResp;
    }
}

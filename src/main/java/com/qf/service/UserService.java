package com.qf.service;

import com.qf.common.BaseResp;
import com.qf.pojo.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    BaseResp login(User user);

    BaseResp registry(User user, HttpServletRequest request);

    String sendEmail(String email, HttpServletRequest request);
}

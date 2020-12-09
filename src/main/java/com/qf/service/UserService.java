package com.qf.service;

import com.qf.common.BaseResp;
import com.qf.pojo.User;

public interface UserService {
    BaseResp login(User user);

    BaseResp registry(User user);
}

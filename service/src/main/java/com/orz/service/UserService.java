package com.orz.service;

import com.orz.bean.User;

public interface UserService {
    //登录
    User doLogin(String username);
}

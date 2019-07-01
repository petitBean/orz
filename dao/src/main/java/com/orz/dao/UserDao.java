package com.orz.dao;

import com.orz.bean.User;

public interface UserDao {
    //登录
    User doLogin(String username);
}


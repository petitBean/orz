package com.orz.controller;

import com.orz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Wangxingze
 * @date 2019-07-01 19:27
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //登录
    public ModelAndView doLogin(String username){
        return null;
    }
}

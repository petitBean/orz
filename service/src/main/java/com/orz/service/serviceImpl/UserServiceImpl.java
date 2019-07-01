package com.orz.service.serviceImpl;

import com.orz.bean.User;
import com.orz.dao.UserDao;
import com.orz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wangxingze
 * @date 2019-07-01 22:26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询所有用户
     * @return
     */
    @Override
   public List<User> findAll(){
        return userDao.findAll();
    }

    /**
     * 通过用户名查找一个用户信息
     * @param userName
     * @return
     */
    @Override
   public User findOneUserByUserName(String userName){
        return userDao.findOneUserByUserName(userName);
    }

    /**
     * 通过用户id查询一个用户
     * @param userId
     * @return
     */
    @Override
   public User findOneUserByUserId(Integer userId){
        return userDao.findOneUserByUserId(userId);
    }

    /**
     * 插入一个新用户
     * @param user
     */
    @Override
    public void insertOneUser(User user){
        userDao.insertOneUser(user);
    }
}

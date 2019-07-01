package com.orz.serviceTest;

import com.orz.bean.User;
import com.orz.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

/**
 * @author Wangxingze
 * @date 2019-07-01 23:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"file: /controller/src/main/resources/applicationContext.xml"})
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findAll(){
        List<User> users=userService.findAll();
        Assert.assertEquals(1,users.size());
    }
}

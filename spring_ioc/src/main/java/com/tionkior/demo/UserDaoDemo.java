package com.tionkior.demo;

import com.tionkior.dao.UserDao;
import com.tionkior.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : UserDaoDemo
 * @Author : TionKior
 * @Date : 2021/6/4 9:29
 * @Version : V1.0
 * @Description :
 */

public class UserDaoDemo {
    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();

    }
}

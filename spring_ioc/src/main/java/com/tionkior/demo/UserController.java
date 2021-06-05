package com.tionkior.demo;

import com.tionkior.service.UserService;
import com.tionkior.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : UserController
 * @Author : TionKior
 * @Date : 2021/6/4 11:08
 * @Version : V1.0
 * @Description :
 */

public class UserController {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        // UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);

        userService.save();

    }
}

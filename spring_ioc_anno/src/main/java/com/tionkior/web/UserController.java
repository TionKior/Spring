package com.tionkior.web;

import com.tionkior.config.SpringConfiguration;
import com.tionkior.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : UserController
 * @Author : TionKior
 * @Date : 2021/6/5 10:04
 * @Version : V1.0
 * @Description :
 */


public class UserController {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();

    }

}

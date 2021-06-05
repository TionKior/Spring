package com.tionkior.service.impl;

import com.tionkior.dao.UserDao;
import com.tionkior.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


/**
 * @ClassName : UserServiceImpl
 * @Author : TionKior
 * @Date : 2021/6/5 9:58
 * @Version : V1.0
 * @Description : UserService实现类
 */

//<bean id="userService" class="com.tionkior.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")
//@Scope("prototype")
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")
    private String driver;

    //<property name="userDao" ref="userDao"/>
    //@Autowired //按照数据类型从Spring容器中进行匹配
    //@Qualifier("userDao") //是按照id值从容器中进行匹配的 但是主要此处@Qualifier结合@Autowired一起使用

    @Resource(name = "userDao") //@Resource相当于@Qualifier+@Autowired
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct
    public void init() {
        System.out.println("Service对象的初始化方法");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Service对象的销毁方法");
    }

}

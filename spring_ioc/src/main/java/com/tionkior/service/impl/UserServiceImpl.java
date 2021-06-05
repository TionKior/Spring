package com.tionkior.service.impl;

import com.tionkior.dao.UserDao;
import com.tionkior.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : UserServiceImpl
 * @Author : TionKior
 * @Date : 2021/6/4 11:06
 * @Version : V1.0
 * @Description : UserService实现类
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

/*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        userDao.save();
    }
}

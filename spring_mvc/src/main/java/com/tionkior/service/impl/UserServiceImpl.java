package com.tionkior.service.impl;

import com.tionkior.dao.UserDao;
import com.tionkior.service.UserService;

/**
 * @ClassName : UserServiceImpl
 * @Author : TionKior
 * @Date : 2021/6/6 7:50
 * @Version : V1.0
 * @Description :
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}

package com.tionkior.factory;

import com.tionkior.dao.UserDao;
import com.tionkior.dao.impl.UserDaoImpl;

/**
 * @ClassName : DynamicFactory
 * @Author : TionKior
 * @Date : 2021/6/4 10:34
 * @Version : V1.0
 * @Description : 实例工厂
 */

public class DynamicFactory {

    public UserDao getUserDao() {
        return new UserDaoImpl();
    }

}

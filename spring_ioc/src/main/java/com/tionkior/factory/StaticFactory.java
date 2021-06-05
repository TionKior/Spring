package com.tionkior.factory;

import com.tionkior.dao.UserDao;
import com.tionkior.dao.impl.UserDaoImpl;

/**
 * @ClassName : StaticFactory
 * @Author : TionKior
 * @Date : 2021/6/4 10:25
 * @Version : V1.0
 * @Description : 静态工厂
 */

public class StaticFactory {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

}

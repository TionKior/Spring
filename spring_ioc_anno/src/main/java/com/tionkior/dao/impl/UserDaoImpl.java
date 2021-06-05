package com.tionkior.dao.impl;

import com.tionkior.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @ClassName : UserDaoImpl
 * @Author : TionKior
 * @Date : 2021/6/5 9:57
 * @Version : V1.0
 * @Description : UserDao实现类
 */


//<bean id="userDao" class="com.tionkior.dao.impl.UserDaoImpl"/>
//@Repository("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running...");
    }
}

package com.tionkior.service;

import com.tionkior.dao.UserMapper;
import com.tionkior.dao.impl.UserMapperImpl;
import com.tionkior.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName : ServiceDemo
 * @Author : TionKior
 * @Date : 2021/6/18 8:32
 * @Version : V1.0
 * @Description :
 */

public class ServiceDemo {

    public static void main(String[] args) throws IOException {

        // 创建dao层对象  当前dao层实现是手动编写的
        UserMapper userMapper = new UserMapperImpl();
        List<User> userList = userMapper.findAll();

        System.out.println(userList);
    }

}

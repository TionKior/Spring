package com.tionkior.service;

import com.tionkior.dao.UserMapper;
import com.tionkior.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
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

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findAll();
        System.out.println(userList);

        User user = mapper.findById(1);
        System.out.println(user);

    }

}

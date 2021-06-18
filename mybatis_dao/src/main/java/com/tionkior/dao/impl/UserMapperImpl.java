package com.tionkior.dao.impl;

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
 * @ClassName : UserMapperImpl
 * @Author : TionKior
 * @Date : 2021/6/18 8:27
 * @Version : V1.0
 * @Description :
 */

public class UserMapperImpl implements UserMapper {

    @Override
    public List<User> findAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> userList = sqlSession.selectList("userMapper.findAll");

        return userList;
    }
}

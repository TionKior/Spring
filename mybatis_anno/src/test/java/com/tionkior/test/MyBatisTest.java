package com.tionkior.test;

import com.tionkior.domain.User;
import com.tionkior.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName : MyBatisTest
 * @Author : TionKior
 * @Date : 2021/6/19 10:55
 * @Version : V1.0
 * @Description :
 */

public class MyBatisTest {

    private UserMapper mapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("tom");
        user.setPassword("abc");
        mapper.save(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(11);
        user.setUsername("lucy");
        user.setPassword("123");
        mapper.update(user);
    }

    @Test
    public void testDelete() {
        User user = new User();
        mapper.delete(10);
    }

    @Test
    public void findById() {
        User user = mapper.findById(2);
        System.out.println(user);
    }

    @Test
    public void findAll() {
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

}

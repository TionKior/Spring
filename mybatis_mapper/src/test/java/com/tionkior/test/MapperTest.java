package com.tionkior.test;

import com.tionkior.domain.User;
import com.tionkior.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : MapperTest
 * @Author : TionKior
 * @Date : 2021/6/18 9:52
 * @Version : V1.0
 * @Description :
 */

public class MapperTest {

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 模拟条件User
        User condition = new User();
        //condition.setId(1);
        condition.setUsername("zhangsan");
        //condition.setPassword("123");

        // 模拟ids的数据
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);

        List<User> userList = userMapper.findByIds(ids);

        System.out.println(userList);


    }

}

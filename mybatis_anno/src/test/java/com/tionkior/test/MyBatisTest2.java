package com.tionkior.test;

import com.tionkior.domain.Order;
import com.tionkior.domain.User;
import com.tionkior.mapper.OrderMapper;
import com.tionkior.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import javax.management.relation.Role;
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

public class MyBatisTest2 {

    private OrderMapper mapper;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(OrderMapper.class);
    }


    @Test
    public void testSave() {
        List<Order> all = mapper.findAll();
        for (Order order : all) {
            System.out.println(order);
        }
    }

}

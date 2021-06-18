package com.tionkior.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tionkior.domain.User;
import com.tionkior.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @ClassName : MybatisTest
 * @Author : TionKior
 * @Date : 2021/6/18 18:14
 * @Version : V1.0
 * @Description :
 */

public class MybatisTest {

    @Test
    public void test3() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 设置分页相关参数   当前页+每页显示的条数
        PageHelper.startPage(1, 3);

        List<User> userList = userMapper.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

        // 获得与分页相关的参数
        PageInfo<User> pageInfo = new PageInfo<User>(userList);

        // 当前页
        pageInfo.getPageNum();
        // 每页显示条数
        pageInfo.getPageSize();
        // 总条数
        pageInfo.getTotal();
        // 总页数
        pageInfo.getPages();
        // 上一页
        pageInfo.getPrePage();
        // 下一页
        pageInfo.getNextPage();
        // 是否是第一页
        pageInfo.isIsFirstPage();
        // 是否是最后一页
        pageInfo.isIsLastPage();


        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findById(9);
        System.out.println("user中的birthday：" + user.getBirthday());

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 创建user
        User user = new User();
        user.setUsername("ceshi");
        user.setPassword("abc");
        user.setBirthday(new Date());

        // 执行保存操作
        userMapper.save(user);

        sqlSession.commit();
        sqlSession.close();
    }

}

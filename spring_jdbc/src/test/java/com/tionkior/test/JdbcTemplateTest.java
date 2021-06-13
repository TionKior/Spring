package com.tionkior.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.CommonDataSource;
import java.beans.PropertyVetoException;

/**
 * @ClassName : JdbcTemplentTest
 * @Author : TionKior
 * @Date : 2021/6/13 8:19
 * @Version : V1.0
 * @Description :
 */

public class JdbcTemplateTest {

    @Test
    //测试Spring产生jdbcTemplate对象
    public void test2() throws PropertyVetoException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = app.getBean(JdbcTemplate.class);
        int row = jdbcTemplate.update("insert into account values (?,?)", "lisi", 5000);
        System.out.println(row);
    }

    @Test
    //测试JdbcTemplate开发步骤
    public void test1() throws PropertyVetoException {
        //创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("ssx14233");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置数据源对象 知道数据库在哪
        jdbcTemplate.setDataSource(dataSource);
        //执行操作
        int row = jdbcTemplate.update("insert into account values (?,?)", "tom", 5000);
        System.out.println(row);
    }

}



package com.tionkior.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName : JdbcTemplateCRUDTest
 * @Author : TionKior
 * @Date : 2021/6/13 9:13
 * @Version : V1.0
 * @Description : Spring集成Junit测试
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {
        jdbcTemplate.update("update account set money = ? where name = ?", 10000, "tom");
    }

    @Test
    public void testDelete() {
        jdbcTemplate.update("delete from account where name = ?", "tom");
    }

}

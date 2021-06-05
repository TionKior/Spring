package com.tionkior.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @ClassName : SpringConfiguration
 * @Author : TionKior
 * @Date : 2021/6/5 11:55
 * @Version : V1.0
 * @Description : Spring配置类
 */

// 标志该类是Spring的核心配置类
@Configuration
// <context:component-scan base-package="com.tionkior"/>
@ComponentScan("com.tionkior")
// <import resource=""/>
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {


}

package com.tionkior.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @ClassName : ContextLoaderListener
 * @Author : TionKior
 * @Date : 2021/6/6 8:55
 * @Version : V1.0
 * @Description : 应用上下文加载器监听器
 */

@WebListener
public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        //读取web.xml中的全局参数
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        ApplicationContext app = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app", app);
        System.out.println("spring容器创建完毕");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

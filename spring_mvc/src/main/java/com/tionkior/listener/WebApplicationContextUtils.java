package com.tionkior.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * @ClassName : WebApplicationContextUtils
 * @Author : TionKior
 * @Date : 2021/6/6 9:13
 * @Version : V1.0
 * @Description :
 */

public class WebApplicationContextUtils {

    public static ApplicationContext getWebApplicationContext(ServletContext servletContext) {
        return (ApplicationContext) servletContext.getAttribute("app");
    }

}

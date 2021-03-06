package com.tionkior.web;

import com.tionkior.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName : UserServlet
 * @Author : TionKior
 * @Date : 2021/6/6 7:58
 * @Version : V1.0
 * @Description :
 */

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        ServletContext servletContext = this.getServletContext();
        // ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");

        //ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);

        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService = app.getBean(UserService.class);
        userService.save();

    }
}

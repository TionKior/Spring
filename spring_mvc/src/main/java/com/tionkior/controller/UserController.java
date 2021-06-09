package com.tionkior.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tionkior.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName : UserController
 * @Author : TionKior
 * @Date : 2021/6/6 10:42
 * @Version : V1.0
 * @Description :
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/quick12")
    @ResponseBody
    public void save12(User user) {
        System.out.println(user);
    }

    @RequestMapping(value = "/quick11")
    @ResponseBody
    public void save11(String username, int age) {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping(value = "/quick10")
    @ResponseBody
    //期望SpringMVC自动将User转换成json格式的字符串
    public User save10() {
        User user = new User();
        user.setUsername("ssx");
        user.setAge(18);

        return user;
    }

    @RequestMapping(value = "/quick9")
    @ResponseBody
    public String save9() throws JsonProcessingException {
        User user = new User();
        user.setUsername("ssx");
        user.setAge(18);
        //使用json的转换工具将对象转换成json格式字符串再返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);

        return json;
    }

    @RequestMapping(value = "/quick8")
    @ResponseBody
    public String save8() {
        return "{\"username\":\"zhangsan\",\"age\":18}";
    }

    @RequestMapping(value = "/quick7")
    @ResponseBody // 告知SpringMVC框架 不进行视图跳转,直接进行数据响应
    public String save7() {
        return "hello tionkior";
    }

    @RequestMapping(value = "/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello tionkior");
    }

    @RequestMapping(value = "/quick5")
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "tionkior");
        return "success";
    }

    @RequestMapping(value = "/quick4")
    public String save4(Model model) {
        model.addAttribute("username", "tionkior");
        return "success";
    }

    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        modelAndView.addObject("username", "tionkior");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick2")
    public ModelAndView save2() {
        /*
            Model:模型 作用封装数据
            View: 视图 作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username", "tionkior");
        //设置视图名称
        modelAndView.setViewName("success");

        return modelAndView;

    }

    // 请求地址 http://localhost:8080/user/quick
    @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})
    public String save() {
        System.out.println("Controller save running...");
        return "redirect:success";
    }

}

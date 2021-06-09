package com.tionkior.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

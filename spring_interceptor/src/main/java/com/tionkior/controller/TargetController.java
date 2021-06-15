package com.tionkior.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName : TargetController
 * @Author : TionKior
 * @Date : 2021/6/15 12:33
 * @Version : V1.0
 * @Description :
 */

@Controller
public class TargetController {

    @RequestMapping("/target")
    public ModelAndView show() {
        System.out.println("目标资源执行...");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "tionkior");
        modelAndView.setViewName("index");
        return modelAndView;

    }

}

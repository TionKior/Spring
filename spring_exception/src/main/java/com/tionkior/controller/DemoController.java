package com.tionkior.controller;

import com.tionkior.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName : DemoController
 * @Author : TionKior
 * @Date : 2021/6/15 14:39
 * @Version : V1.0
 * @Description :
 */

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/show")
    public String show(@RequestParam(value = "name", required = true) String name) {
        System.out.println("show running...");
        demoService.show1();
        return "index";
    }

}

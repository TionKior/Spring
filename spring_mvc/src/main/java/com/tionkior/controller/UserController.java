package com.tionkior.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    // 请求地址 http://localhost:8080/user/quick
    @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})
    public String save() {
        System.out.println("Controller save running...");

        return "success";
    }

}

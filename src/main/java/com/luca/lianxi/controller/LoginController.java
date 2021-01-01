package com.luca.lianxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: lianxi->LoginController
 * @description:
 * @author: ljm
 * @create: 2020-11-03 20:39
 **/
@Controller
public class LoginController {

    @RequestMapping(value = "/")
    public String homePage() {
        return "login";
    }
}

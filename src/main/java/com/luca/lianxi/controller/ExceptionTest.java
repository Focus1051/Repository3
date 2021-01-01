package com.luca.lianxi.controller;

import com.luca.lianxi.myException.Excep;
import com.luca.lianxi.myException.culculate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: lianxi->Cookie
 * @description:
 * @author: ljm
 * @create: 2020-06-29 09:53
 **/
@Controller
@RequestMapping("/Exp")
public class ExceptionTest {
    @RequestMapping("/testExp")
    public void mye(Integer a,Integer b)  {
        try {
            culculate c = new culculate();
            c.function1(a,b);
        } catch (Excep excep) {
            excep.printStackTrace();
            System.out.println("打印错误详细："+excep.getMessage());
        }

    }

    }



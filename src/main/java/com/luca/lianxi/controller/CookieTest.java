package com.luca.lianxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: lianxi->Cookie
 * @description:
 * @author: ljm
 * @create: 2020-06-29 09:53
 **/
@Controller
@RequestMapping("/cookie")
public class CookieTest {
    @RequestMapping("/sendCookie")
    public void sendCookie(HttpServletResponse response) {
        Cookie c = new Cookie("user","ljm");
        Cookie d = new Cookie("age","18");
        response.addCookie(c);
        response.addCookie(d);
    }

    @RequestMapping("/getCookie")
    public void getCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cs = request.getCookies();
        if(cs!=null){
            for (Cookie c : cs) {
                String name = c.getName();
                String value= c.getValue();
                System.out.println(name+"和"+value);

            }

        }
    }

    @RequestMapping("/getCookie2")
    public void getCookie2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;utf-8");
        Cookie[] cs = request.getCookies();
        if(cs==null){
            Date date = new Date();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
            String dataString=sf.format(date);
            Cookie co = new Cookie("lastTime",dataString);
            response.addCookie(co);
            response.getWriter().write("This is your first time coming here!");

        }else{
            for (Cookie c : cs) {
                String name = c.getName();
                String value= c.getValue();
                if("lastTime".equals(name)){
                    Date date = new Date();
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
                    String dataString=sf.format(date);
                    Cookie co = new Cookie("lastTime",dataString);
                    response.addCookie(co);
                    response.getWriter().write("Welcome back Your last access time is:"+value);
                }
            }
        }

    }

}

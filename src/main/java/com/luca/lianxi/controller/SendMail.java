package com.luca.lianxi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;

/**
 * @program: lianxi->SendMail
 * @description:
 * @author: ljm
 * @create: 2020-08-03 09:01
 **/
@Controller
@RequestMapping("/sendMail")
public class SendMail {
    @Autowired
    private JavaMailSender javaMailSender;
    @RequestMapping("/send")
    public String testSend() throws MessagingException {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("2246514127@qq.com");
        message.setTo("ljm1888120@163.com");
        message.setSubject("Nice to see you");
        message.setText("Have a good day!");
        javaMailSender.send(message);
        return"success";
    }
}

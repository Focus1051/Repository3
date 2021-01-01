package com.luca.lianxi.controller;

import com.luca.lianxi.entity.Message;
import com.luca.lianxi.service.MessageService;
import com.luca.lianxi.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: lianxi->ExcelController
 * @description:
 * @author: ljm
 * @create: 2020-07-08 11:12
 **/
@Controller
public class ExcelController {
    @Autowired
    private MessageService messageService;
    @RequestMapping("/getExcel")
    public void excel(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition","attachment; filename="+"good.xlsx");
        List<Message> message = new ArrayList<>();
        message= messageService.selectAllHire();
        ExcelUtil.writeExcel(response,message);
    }
}

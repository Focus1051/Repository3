package com.luca.lianxi.controller;

import com.luca.lianxi.entity.Message;
import com.luca.lianxi.service.MessageService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: lianxi->TestController
 * @description:
 * @author: ljm
 * @create: 2020-06-24 22:57
 **/
@Controller
@RequestMapping("/a")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("/b")
    @ResponseBody
    public String fun (Message message){
        String a= message.getAuthor();
        return a;

    }

    @RequestMapping("/selectAllHire")
    @Transactional
    public String fun2(Model model){
        List<Message> message = new ArrayList<>();
        message=messageService.selectAllHire();
        model.addAttribute("message",message);
        return "fun";
    }

    @CrossOrigin(origins ="*",maxAge = 3600)
    @RequestMapping("/insert")
    @Transactional
    @ResponseBody
    public Object insert(@RequestBody Message message, Model model){
        messageService.insert(message);
        //return "fun2";
        List<Message> msg = new ArrayList<>();
        msg=messageService.selectAllHire();
        return msg;
    }


    @CrossOrigin(origins ="*",maxAge = 3600)
    @RequestMapping("/selectAllHire2")
    @ApiOperation(value="查询所有信息la",notes="查询la")
    @ResponseBody
    public Object fun3(Model model){
        List<Message> msg = new ArrayList<>();
        msg=messageService.selectAllHire();
        return msg;
    }

    @CrossOrigin(origins ="*",maxAge = 3600)
    @RequestMapping("/deleteInfo")
    @ApiOperation(value="删除招聘信息",notes="删除招聘")
    @ResponseBody
    public Object deleteInfo(Integer id){

        messageService.delete(id);
        return "删除成功！";
    }

    @CrossOrigin(origins ="*",maxAge = 3600)
    @RequestMapping("/selectById")
    @ApiOperation(value="删除招聘信息",notes="删除招聘")
    @ResponseBody
    public int selectById(Integer id,Message message){

       message= messageService.selectById(id);
       int a= message.getMessageType();
        return a;
    }

    @CrossOrigin(origins ="*",maxAge = 3600)
    @RequestMapping("/updateInfo")
    @ApiOperation(value="提交更新招聘信息",notes="更新招聘")
    @ResponseBody
    public Object updateInfo(@RequestBody Message message){

        int res=messageService.updateInfo(message);
        if(res==1){
            return "更新成功!";
        }
        return "更新失败!";
    }


    @RequestMapping("/alert1")
    @ApiOperation(value="打印店东西",notes="打印la")
    @ApiImplicitParam(name="you",value="打印这个字符串",required=true,paramType ="query",dataType = "String")
    public void fun4(Integer you, HttpServletResponse response) throws IOException {
      // String you= request.getParameter("name");
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("You are excellent!<br>");
        response.getWriter().write(97);
        response.getWriter().println(you);
        //response.getWriter().println("lala<br>");
        //response.getWriter().println("lala2");
        response.getWriter().write("<script> alert('lala');</script> ");
    }





}

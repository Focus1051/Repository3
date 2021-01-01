package com.luca.lianxi.service;

import com.luca.lianxi.entity.Message;

import java.util.List;

public interface MessageService {
    /*查询所有招聘信息*/
   List<Message> selectAllHire();
    /* 添加一天记录*/
    int insert(Message message);
    /*删除招聘信息*/
    int delete(Integer id);

    Message selectById(Integer id);

    int updateInfo(Message message);
}

package com.luca.lianxi.dao;

import com.luca.lianxi.entity.Message;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MessageMapper {
    /*查询所有招聘信息*/
    List<Message> selectAllHire();
    /*插入一条数据*/
    int insert(Message message);
    /*删除招聘信息*/
    int delete(Integer id);

    Message selectById(Integer id);

    int updateInfo(Message message);
}

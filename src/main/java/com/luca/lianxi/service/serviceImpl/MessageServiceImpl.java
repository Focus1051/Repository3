package com.luca.lianxi.service.serviceImpl;

import com.luca.lianxi.dao.MessageMapper;
import com.luca.lianxi.entity.Message;
import com.luca.lianxi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: lianxi->MessageServiceImpl
 * @description:
 * @author: ljm
 * @create: 2020-06-25 16:05
 **/
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Message> selectAllHire() {
        return messageMapper.selectAllHire();
    }

    @Override
    public int insert(Message message) {
        return messageMapper.insert(message);
    }

    @Override
    public int delete(Integer id) {
        return messageMapper.delete(id);
    }

    @Override
    public Message selectById(Integer id) {
        return messageMapper.selectById(id);
    }

    @Override
    public int updateInfo(Message message) {
        return messageMapper.updateInfo(message);
    }
}

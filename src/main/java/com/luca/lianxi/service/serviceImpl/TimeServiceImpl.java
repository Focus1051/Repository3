package com.luca.lianxi.service.serviceImpl;

import com.luca.lianxi.service.TimeService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @program: lianxi->MessageServiceImpl
 * @description:
 * @author: ljm
 * @create: 2020-06-25 16:05
 **/
@Service
public class TimeServiceImpl implements TimeService {

    @Override
    @Scheduled(cron ="0/2 * * * * ?")
    public void printTime() {
        System.out.println("很不错哟");
    }
}

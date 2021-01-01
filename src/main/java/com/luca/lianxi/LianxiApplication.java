package com.luca.lianxi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@EnableScheduling
@ServletComponentScan
@MapperScan("com.luca.lianxi.dao")
public class LianxiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LianxiApplication.class, args);
    }

}





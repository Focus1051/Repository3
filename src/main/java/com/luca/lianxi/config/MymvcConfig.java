package com.luca.lianxi.config;

import com.luca.lianxi.component.MylocaleResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

/**
 * @program: lianxi->MymvcConfig
 * @description:
 * @author: ljm
 * @create: 2020-11-03 23:16
 **/
@Configuration
public class MymvcConfig extends WebMvcAutoConfiguration {

@Bean
    public LocaleResolver localeResolver (){
        return new MylocaleResolver();
    }

}

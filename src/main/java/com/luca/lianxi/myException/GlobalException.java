package com.luca.lianxi.myException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: lianxi->GlobalException
 * @description:
 * @author: ljm
 * @create: 2020-10-31 18:52
 **/

@ControllerAdvice
public class GlobalException {
    @ResponseBody
    @ExceptionHandler(value=java.lang.Exception.class)
    public  Map<String,Object> GlobalException1() {
        Map<String,Object> map1 = new HashMap<>();
        map1.put("错误","空指针异常！");
        return map1;
    }

}

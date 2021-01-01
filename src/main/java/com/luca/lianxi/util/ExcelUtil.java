package com.luca.lianxi.util;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.luca.lianxi.entity.Message;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @program: lianxi->ExcelUtil
 * @description:
 * @author: ljm
 * @create: 2020-07-08 11:22
 **/
public class ExcelUtil {
    public static void writeExcel(HttpServletResponse response, List<Message> message) throws IOException {
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).build();
        //定义工作表对象
        WriteSheet sheet = EasyExcel.writerSheet(0,"HireMessages").head(Message.class).build();
        //往EXcel文件中写入数据
        excelWriter.write(message,sheet);
        //关闭输出流
        excelWriter.finish();

    }

}

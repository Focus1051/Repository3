package com.luca.lianxi.myException;

/**
 * @program: lianxi->culculate
 * @description:
 * @author: ljm
 * @create: 2020-07-06 11:45
 **/
public class culculate {
    public void function1(Integer a,Integer b) throws Excep {
            if(b==0){
                throw new Excep("除数不能为0");
            }else{
                double c=a/b;
                System.out.println("c的值是："+c);
            }




    }
}

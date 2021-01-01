package com.luca.lianxi.myException;

/**
 * @program: lianxi->Excep
 * @description:
 * @author: ljm
 * @create: 2020-07-06 11:15
 **/
public class Excep extends Exception {
    public Excep() {
    }

    public Excep(String message) {
        super(message);
    }

    public Excep(String message, Throwable cause) {
        super(message, cause);
    }

    public Excep(Throwable cause) {
        super(cause);
    }

    public Excep(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

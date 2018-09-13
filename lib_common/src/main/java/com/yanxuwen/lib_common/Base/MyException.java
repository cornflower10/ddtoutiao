package com.yanxuwen.lib_common.Base;


public class MyException extends Throwable {

    public MyException() {

        super();

    }

    public MyException(String msg) {

        super(msg);

    }

    public MyException(String msg, Throwable cause) {

        super(msg, cause);

    }

    public MyException(Throwable cause) {

        super(cause);

    }

}

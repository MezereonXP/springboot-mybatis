package org.spring.springboot.util;

public class MyException extends Exception {

    private static final long serialVersionUID = 1L;

    String message;

    public MyException(String ErrorMessagr) {
        message = ErrorMessagr;
    }

    public String getMessage() {
        return message;
    }
}

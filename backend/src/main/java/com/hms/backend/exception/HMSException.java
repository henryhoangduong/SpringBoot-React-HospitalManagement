package com.hms.backend.exception;

public class HMSException extends Exception{
    private static final  long serialVersionUID = 1L;
    public HMSException(String message){
        super(message);
    }
}

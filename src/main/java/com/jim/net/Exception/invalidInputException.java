package com.jim.net.Exception;
/**
 * Created by jim fu on 17/10/23.
 */
public class invalidInputException extends Exception{
    private static final long serialVersionUID = -6010872894574024501L;

    public invalidInputException(String message) {
        super(message);
    }
}

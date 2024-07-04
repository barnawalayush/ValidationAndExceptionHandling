package com.ashdaker.rest.validationandexceptionhandling.exception;

public class UserNotFoundException  extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }
}

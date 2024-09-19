package com.springbootacademy.point_of_sale.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class NotFoundExeption extends RuntimeException{
    public  NotFoundExeption(String message){
        super(message);
    }
}

package com.springbootacademy.point_of_sale.advisor;

import com.springbootacademy.point_of_sale.exception.NotFoundExeption;
import com.springbootacademy.point_of_sale.util.StandardResponce;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(NotFoundExeption.class)
    public ResponseEntity<StandardResponce> handleNotFound(NotFoundExeption e){
        return  new ResponseEntity<StandardResponce>(
                new StandardResponce(201,"Error",e.getMessage()+" sachintha")
                , HttpStatus.NOT_FOUND);

    }
}

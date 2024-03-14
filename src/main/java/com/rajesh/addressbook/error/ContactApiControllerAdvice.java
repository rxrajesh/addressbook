package com.rajesh.addressbook.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class ContactApiControllerAdvice {

    @ExceptionHandler(value =MethodArgumentTypeMismatchException.class )
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex){
        Map<String , List<String>> body = new HashMap<>();

        return "the url type is bad :->  "+  ex.getMessage() ;
    }
}

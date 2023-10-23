package com.workintech.movieactor.movieactor.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HollywoodExceptions {

    @ExceptionHandler
    public ResponseEntity<HollywoodErrorResponse> handlerException(MovieException exception) {
        HollywoodErrorResponse response = new HollywoodErrorResponse(exception.getCode().value(),
                exception.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, exception.getCode());
    }
    @ExceptionHandler
    public ResponseEntity<HollywoodErrorResponse> handlerException(Exception exception) {
        HollywoodErrorResponse response = new HollywoodErrorResponse(HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


}

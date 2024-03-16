package com.example.carlsonapp.error;

import com.example.carlsonapp.controller.OwnException;
import com.example.carlsonapp.dto.ErrorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = OwnException.class)
    protected ResponseEntity<ErrorDto> handlerOwnException(){
        return ResponseEntity
                .status(400)
                .header("почему", "потому")
                .body(new ErrorDto(400, "ыыыыы"));
    }
}

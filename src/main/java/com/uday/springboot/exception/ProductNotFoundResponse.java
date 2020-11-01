package com.uday.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ProductNotFoundResponse {
    @ResponseBody
    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ProductNotFoundResponse(ProductNotFoundException productNotFoundException){
        return productNotFoundException.getMessage();
    }
}

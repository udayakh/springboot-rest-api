package com.uday.springboot.exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id) {
        super("The Product with +id "+id+" cannot be found!");
    }
}

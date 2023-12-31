package com.myproject.ecommerce.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)   // Whenever ProductNotFoundException occurs this will send response status as HttpStatus.NOT_FOUND
public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(){
        super();
    }

    public ProductNotFoundException(String message){
        super(message);
    }
}

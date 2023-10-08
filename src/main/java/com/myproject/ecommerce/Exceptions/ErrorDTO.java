package com.myproject.ecommerce.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDTO {

    private int errorId ;

    private String errorMessage;
}

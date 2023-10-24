package com.myproject.ecommerce.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Price extends BaseModel{

    private String currency;
    private double price=0;
}

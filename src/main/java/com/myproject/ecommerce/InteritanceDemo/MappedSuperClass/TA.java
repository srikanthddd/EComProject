package com.myproject.ecommerce.InteritanceDemo.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "mappedSuperClass_TA")
public class TA extends User{

    private double averageRating;
}

package com.myproject.ecommerce.InteritanceDemo.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "mappedSuperClass_mentor")
public class Mentor extends User{

    private double averageRating;
}

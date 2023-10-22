package com.myproject.ecommerce.InteritanceDemo.MappedSuperClass;

import jakarta.persistence.Entity;

@Entity(name = "mappedSuperClass_student")
public class Student extends User{

    private double PSP;
    private double attendance;
}

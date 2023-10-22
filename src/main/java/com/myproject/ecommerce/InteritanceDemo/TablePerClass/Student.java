package com.myproject.ecommerce.InteritanceDemo.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tablePerClass_student")
public class Student extends User {

    private double PSP;
    private double attendance;
}

package com.myproject.ecommerce.InteritanceDemo.Joined;

import jakarta.persistence.Entity;

@Entity(name = "joined_student")
public class Student extends User {

    private double PSP;
    private double attendance;
}

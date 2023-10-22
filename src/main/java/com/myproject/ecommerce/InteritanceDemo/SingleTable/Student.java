package com.myproject.ecommerce.InteritanceDemo.SingleTable;

import jakarta.persistence.Entity;

@Entity(name = "singleTable_student")
public class Student extends User {

    private double PSP;
    private double attendance;
}

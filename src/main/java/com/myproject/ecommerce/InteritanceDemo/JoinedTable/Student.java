package com.myproject.ecommerce.InteritanceDemo.JoinedTable;

import jakarta.persistence.Entity;

@Entity(name = "joinedTable_student")
public class Student extends User {

    private double PSP;
    private double attendance;
}

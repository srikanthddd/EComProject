package com.myproject.ecommerce.InteritanceDemo.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "joinedTable_student")
@PrimaryKeyJoinColumn(name = "user_id")
public class Student extends User {

    private double PSP;
    private double attendance;
}

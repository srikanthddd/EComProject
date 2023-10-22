package com.myproject.ecommerce.InteritanceDemo.SingleTable;

import jakarta.persistence.Entity;

@Entity(name = "singleTable_mentor")
public class Mentor extends User {

    private double averageRating;
}

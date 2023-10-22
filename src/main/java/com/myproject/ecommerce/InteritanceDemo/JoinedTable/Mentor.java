package com.myproject.ecommerce.InteritanceDemo.JoinedTable;

import jakarta.persistence.Entity;

@Entity(name = "joinedTable_mentor")
public class Mentor extends User {

    private double averageRating;
}

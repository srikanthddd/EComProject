package com.myproject.ecommerce.InteritanceDemo.JoinedTable;

import jakarta.persistence.Entity;

@Entity(name = "joinedTable_TA")
public class TA extends User {

    private double averageRating;

}

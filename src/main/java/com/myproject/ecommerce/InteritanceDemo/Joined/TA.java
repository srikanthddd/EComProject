package com.myproject.ecommerce.InteritanceDemo.Joined;

import jakarta.persistence.Entity;

@Entity(name = "joined_TA")
public class TA extends User {

    private double averageRating;

}

package com.myproject.ecommerce.InteritanceDemo.Joined;

import jakarta.persistence.Entity;

@Entity(name = "joined_mentor")
public class Mentor extends User {

    private double averageRating;
}

package com.myproject.ecommerce.InteritanceDemo.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tablePerClass_mentor")
public class Mentor extends User {

    private double averageRating;
}

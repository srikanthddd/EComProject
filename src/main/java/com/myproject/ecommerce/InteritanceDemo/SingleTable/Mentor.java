package com.myproject.ecommerce.InteritanceDemo.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "singleTable_mentor")
@DiscriminatorValue(value = "2")
public class Mentor extends User {

    private double averageRating;
}

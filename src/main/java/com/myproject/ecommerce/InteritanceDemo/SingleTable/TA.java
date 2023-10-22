package com.myproject.ecommerce.InteritanceDemo.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "singleTable_TA")
@DiscriminatorValue(value = "3")
public class TA extends User {

    private double averageRating;

}

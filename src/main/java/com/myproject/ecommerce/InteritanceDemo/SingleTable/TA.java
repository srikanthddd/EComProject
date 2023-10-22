package com.myproject.ecommerce.InteritanceDemo.SingleTable;

import jakarta.persistence.Entity;

@Entity(name = "singleTable_TA")
public class TA extends User {

    private double averageRating;

}

package com.myproject.ecommerce.InteritanceDemo.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name = "tablePerClass_TA")
public class TA extends User {

    private double averageRating;

}

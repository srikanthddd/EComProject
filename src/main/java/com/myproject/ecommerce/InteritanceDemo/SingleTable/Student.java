package com.myproject.ecommerce.InteritanceDemo.SingleTable;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "singleTable_student")
@DiscriminatorValue(value = "1")
public class Student extends User {

    private double PSP;
    private double attendance;
}

package com.myproject.ecommerce.InteritanceDemo.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "joinedTable_TA")
@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User {

    private double averageRating;

}

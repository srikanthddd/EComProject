package com.myproject.ecommerce.InteritanceDemo.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "joinedTable_mentor")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {

    private double averageRating;
}

package com.myproject.ecommerce.Models;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@MappedSuperclass
public class BaseModel {


    @Id
    @GeneratedValue(generator = "uuidgeneratorname")
    @GenericGenerator(name = "uuidgeneratorname", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "binary(16)", nullable = false)
    private UUID uuid;

}

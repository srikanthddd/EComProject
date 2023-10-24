package com.myproject.ecommerce.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {

    //private long id;
    private String title;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    //Means, when product is added, corresponding price will be added and
    // when product is removed, corresponding price will be removed
    private Price price;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    //Means, when product is added, corresponding category will be added
    @JoinColumn(name = "category")
    private Category category;

    private String description;
    private String image; //Will just store the image url

}

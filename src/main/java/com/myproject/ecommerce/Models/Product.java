package com.myproject.ecommerce.Models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {

    private long id;
    private String title;
    private double price;
    private Category category;
    private String description;
    private String image; //Will just store the image url

}

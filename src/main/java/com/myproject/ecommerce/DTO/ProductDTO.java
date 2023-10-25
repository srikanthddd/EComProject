package com.myproject.ecommerce.DTO;

import com.myproject.ecommerce.Models.Category;
import com.myproject.ecommerce.Models.Price;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private String title;
    private String description;
    private String image;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Price price;
}

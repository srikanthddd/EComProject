package com.myproject.ecommerce.Controllers;

import com.myproject.ecommerce.DTO.ProductDTO;
import com.myproject.ecommerce.Exceptions.CategoryNotFoundException;
import com.myproject.ecommerce.Models.Category;
import com.myproject.ecommerce.Models.Product;
import com.myproject.ecommerce.Services.CategoryService;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/Categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/{uuid}")
    public List<ProductDTO> getCategoryByID(@PathVariable("uuid") UUID uuid){
        Optional<Category> category =  categoryService.findCategoryById(uuid);
        if(category.isEmpty()){
            throw new CategoryNotFoundException("Category not found ! ");
        }

        List<Product> products = category.get().getProducts();
        List<ProductDTO> productDTOS = new ArrayList<>();
        for(Product p: products){
            ProductDTO productDTO = new ProductDTO();
            productDTO.setPrice(p.getPrice());
            productDTO.setDescription(p.getDescription());
            productDTO.setImage(p.getImage());
            productDTO.setTitle(p.getTitle());

            productDTOS.add(productDTO);
        }

        return productDTOS;
    }
}

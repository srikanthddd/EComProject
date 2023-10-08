package com.myproject.ecommerce.Products;

import com.myproject.ecommerce.DTO.GenericProductDTO;
import com.myproject.ecommerce.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

//@Component
@Service("FakeStoreProductServiceExample")
public class FakeStoreProductServiceExample{

/*    @Override
    public Product getProductByID(Long id) {
        Product product = new Product();
        product.setId(id);
        return product;
    }*/


    public Product getProductByID(Long id) {
        return null;
    }

    public GenericProductDTO createProduct(GenericProductDTO product) {
        return null;
    }

    public List<GenericProductDTO> getAllProducts() {
        return null;
    }
}

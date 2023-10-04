package com.myproject.ecommerce.Products;

import com.myproject.ecommerce.DTO.GenericProductDTO;
import com.myproject.ecommerce.Models.Product;
import org.springframework.stereotype.Service;

import java.util.Map;

//@Component
@Service("FakeStoreProductServiceExample")
public class FakeStoreProductServiceExample implements ProductService{

    @Override
    public Product getProductByID(Long id) {
        Product product = new Product();
        product.setId(id);
        return product;
    }

    @Override
    public Product callFakeStoreServiceAPI(Long id) {
        return null;
    }

    @Override
    public GenericProductDTO createProduct(GenericProductDTO product) {
        return null;
    }
}

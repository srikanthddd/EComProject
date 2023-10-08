package com.myproject.ecommerce.Products;

import com.myproject.ecommerce.DTO.FakeStoreProductDTO;
import com.myproject.ecommerce.DTO.GenericProductDTO;
import com.myproject.ecommerce.Models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface ProductService {


    public ResponseEntity<Product> getProductByID(Long id);

    public GenericProductDTO createProduct(GenericProductDTO product);

    public List<GenericProductDTO> getAllProducts();

    public GenericProductDTO deleteProduct(Long id);

    public FakeStoreProductDTO updateProduct(Long id, GenericProductDTO genericProductDTO);
}

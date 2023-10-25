package com.myproject.ecommerce.thirdPartyClients.ProductService.FakeStore;

import com.myproject.ecommerce.DTO.GenericProductDTO;
import com.myproject.ecommerce.Models.Category;
import com.myproject.ecommerce.Models.Product;
import com.myproject.ecommerce.Products.ProductService;
import com.myproject.ecommerce.Repositories.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SelfProductServiceImpl implements ProductService {


    private ProductRepository productRepository;

    public SelfProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<Product> getProductByID(Long id) {
        UUID uuid = new UUID(id, id);
        Product product = productRepository.findByuuid(uuid);
        ResponseEntity response = new ResponseEntity(product, HttpStatus.OK);
        return response;
    }

    @Override
    public GenericProductDTO createProduct(GenericProductDTO product) {
        Product prod = new Product();
        prod.setImage(product.getImage());
        prod.setTitle(product.getTitle());
        prod.setDescription(product.getDescription());
        Category category = new Category();
        category.setName(product.getCategory());
        prod.setCategory(category);
        Product response =  productRepository.save(prod);

        GenericProductDTO genericProductDTO = new GenericProductDTO();
        genericProductDTO.setDescription(prod.getDescription());
        genericProductDTO.setTitle(prod.getTitle());

        return genericProductDTO;
    }

    @Override
    public List<GenericProductDTO> getAllProducts() {

        List<GenericProductDTO> response = new ArrayList<>();
        List<Product> allProducts = productRepository.findAll();

        for(Product product : allProducts){
            GenericProductDTO prod = new GenericProductDTO();
            prod.setImage(product.getImage());
            prod.setTitle(product.getTitle());
            prod.setDescription(product.getDescription());
            Category category = new Category();

            prod.setCategory("category");

            response.add(prod);
        }

        return response;
    }

    @Override
    public GenericProductDTO deleteProduct(Long id) {
        UUID uuid = new UUID(id, id);
        productRepository.deleteByUuid(uuid);
        return  null;
    }

    @Override
    public FakeStoreProductDTO updateProduct(Long id, GenericProductDTO genericProductDTO) {
        return null;
        // we can use productRepository.save(id, genericProductDTO). You can write a custom update query.
     }
}

package com.myproject.ecommerce.Products;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.ecommerce.DTO.FakeStoreProductDTO;
import com.myproject.ecommerce.DTO.GenericProductDTO;
import com.myproject.ecommerce.Exceptions.ProductNotFoundException;
import com.myproject.ecommerce.Models.Category;
import com.myproject.ecommerce.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.ErrorResponse;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

//@Component
@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    private RestTemplateBuilder restTemplateBuilder;

    private String getProductURL = "https://fakestoreapi.com/products/{id}";

    private String createProductURL = "https://fakestoreapi.com/products";

    private String getAllProductsURL = "https://fakestoreapi.com/products";

    private ObjectMapper objectMapper = new ObjectMapper();

    public FakeStoreProductService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplateBuilder = restTemplateBuilder;
    }


    @Override
    public GenericProductDTO createProduct(GenericProductDTO product) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<GenericProductDTO> responseEntity = restTemplate.postForEntity(createProductURL, product, GenericProductDTO.class);
        if(!responseEntity.getStatusCode().is2xxSuccessful()){
            throw new RuntimeException("Product is not created !!");
        }
        return responseEntity.getBody();
    }


    @Override
    public Product getProductByID(Long id){
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDTO> response = restTemplate.getForEntity(getProductURL, FakeStoreProductDTO.class, id);
        if(response.getStatusCode().is2xxSuccessful() && response.getBody()!=null && response.getBody().getId()!=null){
            FakeStoreProductDTO fakeStoreProductDTO = response.getBody();
            Product product = new Product();
            product.setId(fakeStoreProductDTO.getId());
            String category = fakeStoreProductDTO.getCategory();
            Category categoryObj = new Category();
            categoryObj.setName(category);
            product.setCategory(categoryObj);
            product.setPrice(fakeStoreProductDTO.getPrice());
            product.setDescription(fakeStoreProductDTO.getDescription());
            product.setTitle(fakeStoreProductDTO.getTitle());
            product.setImage(fakeStoreProductDTO.getImage());

            return product;
        }else {
            throw new ProductNotFoundException("Product not found : "+id);
        }
    }

    @Override
    public List<GenericProductDTO> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<List<GenericProductDTO>> response = restTemplate.exchange(
                getAllProductsURL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<GenericProductDTO>>() {
                }
        );

        return response.getBody();
    }


}

package com.myproject.ecommerce.Products;

import com.myproject.ecommerce.DTO.GenericProductDTO;
import com.myproject.ecommerce.Models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    //@Autowired   --> //Injecting via Constructor injection is recommended.

    private ProductService productService;

    /*@Value("${productService.type}")
    private String productServiceType;*/

    //Constuctor injection
    public ProductController(@Qualifier("FakeStoreProductService") ProductService productService){
        this.productService = productService;
    }

    //Setter injection
    /*public void setProductService(ProductService productService){
        this.productService = productService;
    }*/

    @PostMapping()
    public GenericProductDTO createProduct(@RequestBody GenericProductDTO genericProductDTO){
        return productService.createProduct(genericProductDTO);
    }

    @PutMapping("{id}")
    public void updateProduct(){

    }

    @DeleteMapping("{id}")
    public void deleteProductById(){

    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductByID(id);
    }

    @GetMapping("getAllProducts")
    public List<GenericProductDTO> getAllProducts(){
        return productService.getAllProducts();
    }

}

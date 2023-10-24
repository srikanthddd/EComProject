package com.myproject.ecommerce.Repositories;

import com.myproject.ecommerce.Models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    Product findByTitleEquals(String title);

    Product findByTitleEqualsAndPrice_Price(String title, double price);

    List<Product> findAllByPrice_currency(double currency);

    @Query(value = "select * from product where title =:title", nativeQuery = true)
    List<Product> findAllByTitle(String title);

    @Query(value = CustomQueries.getProductByTitleQuery, nativeQuery = true)
    List<Product> findAllByTitle2(String title);

    @Query("select Product from Product where Product.title = :title") //HQL (This will work with not just sql butall db. And also it has compile time check
    List<Product> findAllByTitle3(String title);

}

package com.myproject.ecommerce.Repositories;

public interface CustomQueries {

    String getProductByTitleQuery = "select * from product where title =:title";

}

package com.myproject.ecommerce.Services;

import com.myproject.ecommerce.Models.Category;

import java.util.Optional;
import java.util.UUID;

public interface CategoryService {

    Optional<Category> findCategoryById(UUID uuid);
}

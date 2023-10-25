package com.myproject.ecommerce.Services;

import com.myproject.ecommerce.Models.Category;
import com.myproject.ecommerce.Repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService{

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Optional<Category> findCategoryById(UUID uuid) {

        Optional<Category> category =  categoryRepository.findById(uuid);

        return category;
    }
}

package com.example.graphql2.controller;

import com.example.graphql2.entity.Category;
import com.example.graphql2.repository.CategoryRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @QueryMapping
    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }
}

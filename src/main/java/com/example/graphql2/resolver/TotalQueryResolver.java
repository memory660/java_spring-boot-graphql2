package com.example.graphql2.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql2.entity.Category;
import com.example.graphql2.entity.Product;
import com.example.graphql2.repository.CategoryRepository;
import com.example.graphql2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@RequiredArgsConstructor
@Component
public class TotalQueryResolver implements GraphQLQueryResolver {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public Iterable<Category> allCategories(){
        return categoryRepository.findAll();
    }

    public List<Product>  allProducts(){
        return productRepository.findAll();
    }

    public Category category(Integer id){
        return categoryRepository.findById(id).orElseGet(null);
    }

    public Product product(Integer id){
        return productRepository.findById(id).orElseGet(null);
    }
}
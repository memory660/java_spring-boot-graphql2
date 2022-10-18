package com.example.graphql2.repository;

import com.example.graphql2.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryResource extends JpaRepository<Category, Long> {
}

package com.example.graphql2.repository;

import com.example.graphql2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductResource extends JpaRepository<Product, Long > {
}

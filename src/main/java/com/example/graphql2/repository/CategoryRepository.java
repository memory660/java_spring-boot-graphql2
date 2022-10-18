package com.example.graphql2.repository;

import com.example.graphql2.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: apple
 * @created on 29/08/2020
 * @Project is Crud
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

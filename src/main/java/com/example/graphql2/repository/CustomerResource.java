package com.example.graphql2.repository;

import com.example.graphql2.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerResource extends JpaRepository<Customer, Long> {
}

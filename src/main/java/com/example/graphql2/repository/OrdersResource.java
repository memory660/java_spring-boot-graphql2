package com.example.graphql2.repository;

import com.example.graphql2.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersResource extends JpaRepository<Orders, Long> {
}

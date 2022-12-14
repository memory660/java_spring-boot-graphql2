package com.example.graphql2.repository;

import com.example.graphql2.entity.info.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardResource extends JpaRepository<Card, Long> {
}

package com.example.graphql2.repository;

import com.example.graphql2.entity.Stuff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuffResource extends JpaRepository<Stuff, Long> {
}

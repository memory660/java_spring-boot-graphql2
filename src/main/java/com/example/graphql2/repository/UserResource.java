package com.example.graphql2.repository;

import com.example.graphql2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserResource extends JpaRepository<User, Long> {
}

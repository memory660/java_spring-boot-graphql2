package com.example.graphql2.repository;

import com.example.graphql2.entity.info.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactResource extends JpaRepository<Contact, Long> {
}

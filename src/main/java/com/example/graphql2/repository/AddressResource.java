package com.example.graphql2.repository;

import com.example.graphql2.entity.info.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressResource extends JpaRepository<Address, Long> {
}

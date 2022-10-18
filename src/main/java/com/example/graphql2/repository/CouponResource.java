package com.example.graphql2.repository;

import com.example.graphql2.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponResource extends JpaRepository<Coupon, Long> {
}

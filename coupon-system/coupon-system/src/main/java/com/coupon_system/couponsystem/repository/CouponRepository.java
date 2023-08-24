package com.coupon_system.couponsystem.repository;

import com.coupon_system.couponsystem.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon,Integer> {
}

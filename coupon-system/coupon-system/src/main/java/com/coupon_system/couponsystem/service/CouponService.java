package com.coupon_system.couponsystem.service;

import com.coupon_system.couponsystem.model.Coupon;
import com.coupon_system.couponsystem.repository.CouponRepository;
import com.coupon_system.couponsystem.utill.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CouponService {
    @Autowired
    private CouponRepository couponRepository;
    public List<Coupon> generateNewCoupon(int value) {
        List<Coupon>list= new ArrayList<>();
        for (int i = 0; i < value; i++) {
            Coupon coupon = Coupon.builder().title(TitleGenerator.titleGenrator()
                    ).description(DiscriptionGenerator.discriptionGenrator
                            ())
                    .couponCode(CouponCodeGenerator.generateCoupon())
                    .validityDate(ValidityDateGenerator.validityDateGenerator())
                    .type(TypeGenerator.genrateCouponType())
                    .discount(DiscountGenerator.discountGenerator())
                    .category(CategoryGenerator.categoryGenarator())
                    .createdDate(CreatedDateGenrator.generateCouponCreationDate())
                    .createdBy(CreatedByGenerator.createdBy())
                    .isActive(IsActiveGenerator.isActive())
                    .status(StatusGenrator.statusGenrator()).build();
            list.add(coupon);
        }
        return couponRepository.saveAll(list);
    }




   /* @Autowired
    private CouponHelper couponHelper;

    public CouponService(CouponHelper couponHelper){
        this.couponHelper = couponHelper;
    }

    public String newCoupon(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public List<String> getNewCoupon(int quantity){
        List<String> coupons = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            String newCoupon = newCoupon();
            coupons.add(newCoupon);
        }
        return coupons;

    }
    public Coupon generateNewCoupon() {
        Coupon coupon = Coupon.builder()
                .id(UUID.randomUUID().toString())
                .validFor(5 + new Random().nextInt(90))
                .type("COUPON")
                .build();
        return coupon;
}*/
}


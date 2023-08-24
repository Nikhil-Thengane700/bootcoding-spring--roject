package com.coupon_system.couponsystem.utill;

import java.util.Random;

public class DiscountGenerator {
    public static int discountGenerator(){
        Random  random = new Random();
        int min =10;
        int max =80;
        return  random.nextInt(min,max);
    }
}

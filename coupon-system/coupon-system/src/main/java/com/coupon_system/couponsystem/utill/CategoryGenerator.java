package com.coupon_system.couponsystem.utill;

import java.util.Random;

public class CategoryGenerator {
    public static String categoryGenarator(){
        Random random =  new Random();
        String categories[] = {"Electronics","Tech & Gadgets","Travel","Books & Stationery","Fashion","Jewelry & Accessories","Entertainment"};
        // random.next will generate random integer
        int index = random.nextInt(categories.length);

        return categories[index];
    }



}

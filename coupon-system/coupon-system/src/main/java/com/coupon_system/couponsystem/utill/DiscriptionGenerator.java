package com.coupon_system.couponsystem.utill;

import java.util.Random;

public class DiscriptionGenerator {
    public static String discriptionGenrator(){
        Random random = new Random();
        String descriptions[] ={"Get a whopping 50% off your purchase for today only!","Enjoy free shipping on all orders with this special coupon",
                "Buy one item, get one free – don't miss this deal!","Exclusive offer for our valued members – save big!",
                "Flash sale happening this weekend – grab your deals!","Welcome new customers with a discount on your first order"};

        int index= random.nextInt(descriptions.length);
        return descriptions[index];

    }
}

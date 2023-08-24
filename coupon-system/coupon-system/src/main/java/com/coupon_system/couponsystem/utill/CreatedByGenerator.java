package com.coupon_system.couponsystem.utill;

import java.util.Random;

public class CreatedByGenerator {
    public static String createdBy()
    {
        Random random= new Random();
        String companies[]={"Amazon","Flipkart","Meesho","IndiaMart","PhonePay","Paytm","GooglePay","Zomato","Swiggy"};
        int index=random.nextInt(companies.length);
        return companies[index];
    }
}

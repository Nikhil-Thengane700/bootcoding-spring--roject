package com.coupon_system.couponsystem.utill;

import java.util.Random;

public class CouponCodeGenerator {



    public static String generateCoupon() {
        String charectors= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Random random = new Random();
        char[] chars = new char[10];
        for (int i = 0; i < chars.length; i++) {
            // It will select random char and store in chars array
            chars[i] = charectors.charAt(random.nextInt(charectors.length()));
        }
        return new String(chars);
    }}

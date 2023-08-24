package com.coupon_system.couponsystem.utill;

import java.util.Random;

public class IsActiveGenerator {
    public static boolean isActive(){
        Random random = new Random();
        boolean[] isActive ={true, false};
        int index= random.nextInt(isActive.length);

        return isActive[index];
    }
}

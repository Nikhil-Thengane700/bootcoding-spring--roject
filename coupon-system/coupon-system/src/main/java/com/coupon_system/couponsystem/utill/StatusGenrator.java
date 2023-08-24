package com.coupon_system.couponsystem.utill;

import java.util.Random;

public class StatusGenrator {
    public static String statusGenrator(){
        Random random = new Random();
        String[] status = {"Active", "Expired", "Upcoming", "Redeemed"};

        int index = random.nextInt(status.length);
        return  status[index];
    }

}

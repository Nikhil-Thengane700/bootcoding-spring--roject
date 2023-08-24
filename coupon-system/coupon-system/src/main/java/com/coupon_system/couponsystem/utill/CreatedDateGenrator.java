package com.coupon_system.couponsystem.utill;

import java.util.Date;
import java.util.Random;

public class CreatedDateGenrator {
    public static Date generateCouponCreationDate() {
        // Get the current date.
        Date today = new Date();

        Random random = new Random();
        int days = random.nextInt(30) + 1;

        // Create a new date that is the current date minus the random number of days.
        //getTime() return the no of ms since epoch (jan1,170)
        Date creationDate = new Date(today.getTime() - days * 24 * 60 * 60 * 1000);

        return creationDate;
    }
}

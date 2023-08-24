package com.coupon_system.couponsystem.utill;

import java.util.Date;
import java.util.Random;

public class ValidityDateGenerator {
    public static Date validityDateGenerator(){
        Random random = new Random();
        // Get the current date.
        Date today = new Date();

  // Generate a random number of days between 1 and 30.
        int days = random.nextInt(30) + 1;

        // Create a new date that is the current date plus the random number of days.
        Date expiryDate = new Date(today.getTime() + days * 24 * 60 * 60 * 1000);

        return expiryDate;
    }
}

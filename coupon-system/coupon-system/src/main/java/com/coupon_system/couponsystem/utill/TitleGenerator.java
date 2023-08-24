package com.coupon_system.couponsystem.utill;

import java.util.Random;

public class TitleGenerator {
    public static String titleGenrator(){
        Random random = new Random();
        String titles[] ={"First order offer","Weekly deal","DiscountDelight"
                ,"Flash sale offer","PromoPerks2023","SaveMoreWave",
                "MegaSaverDeal","VoucherBoostX"};

        int index = random.nextInt(titles.length);
        return titles[index];
    }
}

package com.coupon_system.couponsystem.utill;

import java.util.Random;

public class TypeGenerator {


   public static String genrateCouponType(){

       Random random = new Random();
       String type[]= {"BuyOneGetOne","FreeShipping","FirstPurchase","SeasonalPromo","EndOfSeason","PercentOff"};


       // Get a random type of coupon
       int index= random.nextInt(type.length);

       // Return the type of coupon
       return type[index];
   }


    }


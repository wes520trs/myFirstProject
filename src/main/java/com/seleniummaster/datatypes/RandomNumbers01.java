package com.seleniummaster.datatypes;

import java.util.Random;

public class RandomNumbers01 {
    private static int getRandomNumberInRange(int min, int max) {
        if (min>=max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r=new Random();
        return r.nextInt((max-min)-1)+min;
    }

    //above is the Function getRandomNumberInRange(a,b) written by us.
    //we use it like below:

    public static void main(String[] args) {
        int i=0;
        do {
           System.out.print(getRandomNumberInRange(0,10)+"  ");
           i++;
       } while (i<=10);
    }
}

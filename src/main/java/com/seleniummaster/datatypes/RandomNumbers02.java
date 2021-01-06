package com.seleniummaster.datatypes;

import java.util.Random;

public class RandomNumbers02 {
    public static void main(String[] args) {
        Random random=new Random();
        int i=1;
        while (i<=10) {
            int n=(random.nextInt(10)+11); //11-20
            System.out.print(n+"  ");
            i++;
        }
    }
}

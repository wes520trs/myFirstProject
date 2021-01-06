package com.seleniummaster.datatypes;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.pow(10,3));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.random());
        int randomNumber=(int)(Math.random()*10+1);
        System.out.println(randomNumber);

        Random r=new Random(1);
        System.out.println(r);





    }
}

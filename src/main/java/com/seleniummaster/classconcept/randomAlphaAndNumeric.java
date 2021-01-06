package com.seleniummaster.classconcept;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class randomAlphaAndNumeric {
    public static void main(String[] args) {
        String s= RandomStringUtils.randomAlphanumeric(4,5);
        System.out.println(s);
        long d=System.currentTimeMillis();
        System.out.println(d);
        Random random=new Random();
          int c=random.nextInt(100);
        System.out.println(c);
        int b=(int)(Math.random()*100);
        System.out.println(b);
        }
    }


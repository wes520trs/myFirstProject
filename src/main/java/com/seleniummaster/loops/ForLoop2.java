package com.seleniummaster.loops;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        // 1-200
        int sum=0;
//        int i=1;
        for (int i=1; i<100; i++) {
            sum = sum + i;
            System.out.printf("i=%d; sum=%d \n", i, sum);
        }
        // factorial 5*4*3*2*1
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        long number=input.nextLong();
        int factorialValue=1;
        for (int i=1; i<=number; i++) {
            factorialValue=factorialValue*i;
            System.out.printf("i=%d; factorial=%d; \n",i,factorialValue);
        }



    }
}

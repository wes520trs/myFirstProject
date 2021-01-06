package com.seleniummaster.loops;


import java.util.Scanner;

public class HomeWork_W7D3_PrimeNumbres02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number=input.nextInt();
        for (int j=1; j<=number; j++) {
            int sum=0;
            for (int i = 1; i<=j; i++) {
                if (j % i == 0) {
                    sum++;
                }
            } if (sum==2) {
                System.out.print(j +"  ");
            }
        }
    }
}

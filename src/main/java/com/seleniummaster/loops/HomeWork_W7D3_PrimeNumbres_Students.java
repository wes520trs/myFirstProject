package com.seleniummaster.loops;


import java.util.Scanner;

public class HomeWork_W7D3_PrimeNumbres_Students {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number=input.nextInt();
        int r=0;
        for (int i=2; i<=number; i++) {
            int j = 2;
            while (i>j) {
                if (i%j==0)
                    break;
                j++;
            }
            if (i==j) {
                System.out.print(i + "\t");
                r++;
                if (r % 20 == 0)
                    System.out.println();
            }
        }
    }
}

package com.seleniummaster.loops;


import java.util.Scanner;

public class HomeWork_W7D3_PrimeNumbres_Youtube {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number=input.nextInt();
        for (int i=2; i<=number; i++)
        {
            for (int j=2; j<=i; ++j)
            {
               if (i==j)
               {
                   System.out.print(i+" ");
               }
               if (i%j==0)
               {
                   break;
               }
            }
        }
    }
}

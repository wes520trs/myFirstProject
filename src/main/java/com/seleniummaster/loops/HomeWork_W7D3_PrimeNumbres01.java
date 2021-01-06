package com.seleniummaster.loops;


import java.util.Scanner; //wrong code

public class HomeWork_W7D3_PrimeNumbres01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number=input.nextInt();
        System.out.print("2  3");
        for (int i=2; i<=number; i++) {
            if (i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)
                System.out.print("  "+i);
        }
        System.out.println();
        System.out.println("2  3  5  7  11  13  17  19  23  29  31  37  41  43  47  53  59  61  67  71  73  79  83  89  97 ");
    }
}

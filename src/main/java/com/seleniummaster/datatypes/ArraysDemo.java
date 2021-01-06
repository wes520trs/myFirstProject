package com.seleniummaster.datatypes;

import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int Num=input.nextInt()-1;
        if (Num>=0&&Num<5) {
            String[] cars = {"Benz", "BMW", "Mazda", "Toyota", "Nissan"};
            System.out.println(cars[Num]);
            int[] Mynum = {400000, 350000, 320000, 300000, 290000};
            System.out.println(Mynum[Num]);
        }
        else
            System.out.println("Please enter a number between 1 to 5");

    }
}

package com.seleniummaster.datatypes;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        // Scaner object
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int x=input.nextInt();
        System.out.println("Please enter second number");
        int y=input.nextInt();
        System.out.println("Please enter third number");
        int z=input.nextInt();
        int sum=x+y+z;
        System.out.printf("Sum of those three number %d+%d+%d=%d",x,y,z,sum);
    }
}

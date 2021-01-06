package com.seleniummaster.conditions;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number:");
        int number1=input.nextInt();
        System.out.println("Please enter second number:");
        int number2=input.nextInt();
        System.out.println("Please enter third number:");
        int number3=input.nextInt();
        if (number1>number2&&number1>number3) {
            System.out.println("The biggest number is first number.");
        }
        else if (number2>number1&&number2>number3) {
            System.out.println("The biggest number is second number.");
        }
        else
            System.out.println("The biggest number is third number.");



    }
}

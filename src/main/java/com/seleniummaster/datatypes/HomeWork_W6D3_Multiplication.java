package com.seleniummaster.datatypes;

import java.util.Scanner;

public class HomeWork_W6D3_Multiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.printf("The multiplication of %d and %d is: %d \n",num1,num2,num1*num2);

    }
}

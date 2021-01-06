package com.seleniummaster.conditions;


import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        String[] status={"single", "married"};
        Scanner input=new Scanner(System.in);
        System.out.println("please enter you marital status");
        String truth=input.next();
        System.out.printf("Your marital status is %b",(truth.equals(status[0])));
    }
}

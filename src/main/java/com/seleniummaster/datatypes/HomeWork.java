package com.seleniummaster.datatypes;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {


        //W5D1 Java code project
        System.out.println(" *\n **\n ***\n ****\n *****\n");

        //W5D1 Java code project
        String schoolName="Istanbul University ";
        String address="Beyazit_Istanbul ";
        String zipCode="34000";
        String schoolFullAddress=schoolName+address+zipCode;
        System.out.println(schoolFullAddress);
        System.out.println(schoolName.toUpperCase());
        System.out.println(address.toLowerCase());
        //System.out.println(schoolFullAddress.indexOf("3"));
        //System.out.println(schoolFullAddress.length());
        System.out.println(schoolFullAddress.substring(schoolFullAddress.indexOf("3"),schoolFullAddress.length()));
        System.out.println(schoolName=="University");
        System.out.println(schoolName.contains("s"));
        System.out.println(String.format("My school full address is %s \n",schoolFullAddress));

        //W5D1 Java data type coding project
        Scanner x1 = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        int num1 = x1.nextInt();
        Scanner x2 = new Scanner(System.in);
        System.out.println("Please enter your second number:");
        int num2 = x2.nextInt();
        System.out.println(String.format("The sum of %d and %d is %d", num1, num2, num1 + num2));
        System.out.println(String.format("The difference of %d and %d is %d ", num1, num2, num1 - num2));
        System.out.println(String.format("The multipilication of %d and %d is %d ", num1, num2, num1 * num2));
        System.out.println(String.format("The average of %d and %d is %f", num1, num2, (float) (num1 + num2) / 2));
        System.out.println(String.format("The absolute value of %d and %d differences is %d ", num1, num2, Math.abs((num1 - num2))));
        System.out.println(String.format("The maximum of %d and %d is %d", num1, num2, Math.max(num1, num2)));
        System.out.println(String.format("The minimum of %d and %d is %d", num1, num2, Math.min(num1, num2)));
        if (num1 < num2) {
            System.out.println(String.format("The bigger number of %d and %d is %d ", num1, num2, num2));
        } else {
            System.out.println(String.format("The bigger number of %d and %d is %d", num1, num2, num1));
        }

        Scanner number=new Scanner(System.in);
        System.out.println("Please enter a number:");
        if (number.nextInt()%2==0) {
            System.out.println(String.format("The number you entered is even."));
        } else {
            System.out.println(String.format("The number you entered is odd."));
        }


    }
}


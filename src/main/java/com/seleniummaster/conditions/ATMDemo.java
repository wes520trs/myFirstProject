package com.seleniummaster.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        double accountBalance=5000;
        int pinNumber=1234;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your pin number");
        String myPin=input.next();
        /*int numeric=Integer.parseInt(myPin);
        System.out.println(numeric);*/
        if ( StringUtils.isNumeric(myPin)&&Integer.parseInt(myPin)==pinNumber) {
            System.out.println("Please enter amount of withdraw:");
            double money=input.nextDouble();
            if (money<=accountBalance) {
                System.out.println("Please take the cash "+money);
                System.out.println("Your balance is: "+(accountBalance-money));
                System.out.println("Would you like to continue?");
                String decision=input.next();
                if (decision.equals("yes")) {

                    System.out.println("Please continue to enter withdraw amount:");
                    int money2=input.nextInt();
                    if (money2<(accountBalance-money)) {
                        System.out.println("Please take the cash: "+money2);
                        System.out.println("Your account balance is: "+(accountBalance-money-money2));
                    }
                    else {
                        System.out.printf("Your balance is %f, you don't have enough balace.",(accountBalance-money));
                    }
                }
                else {
                    System.out.println("Thanks for using our ATM, have a nice day!");
                }
            }
            else {
                System.out.println("Your balance is "+accountBalance);
                System.out.println("You don't have enough money to withdraw.");
            }
        }
        else {
            System.out.println("Your pin number is incorrect (or not digit), please enter valid digit pin number.");
        }
    }
}

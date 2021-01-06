package com.seleniummaster.conditions;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter you decision: 'yes' or 'no'");
        String decision=input.next();
        if (decision.equalsIgnoreCase("yes")) {
            System.out.println("Congratulations! You will enter next stage!");
        }
        else if (decision.equalsIgnoreCase("no")) {
            System.out.println("Thanks for participating.");
        }
        else {
            System.out.println("You can only enter 'yes' or 'no', please try again.");
        }


    }
}

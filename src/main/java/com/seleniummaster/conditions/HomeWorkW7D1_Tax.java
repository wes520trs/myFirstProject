package com.seleniummaster.conditions;

import java.util.Scanner;

public class HomeWorkW7D1_Tax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your annual salary:");
        int annualSalary=input.nextInt();
        if (annualSalary>0) {
                System.out.println("Please enter your marital status:");
                String maritalStatus=input.next();
            System.out.println("Your annual salary is: "+annualSalary);
            System.out.println("Your tax filing status is: "+maritalStatus);
                if (maritalStatus.equalsIgnoreCase("single")||maritalStatus.equalsIgnoreCase("married")) {
                    if (maritalStatus.equalsIgnoreCase("single") && annualSalary <= 32000) {
                        double tax = annualSalary * 0.1;
                        System.out.println("Your tax percentage is: 10%");
                        System.out.printf("Your total tax is: %f \n", tax);
                    } else if (maritalStatus.equalsIgnoreCase("single")) {
                        double tax = ((32000 * 0.1) + (annualSalary - 32000) * 0.25);
                        System.out.println("Your tax percentage is: 10% upto 32000, 25% over 32000 ");
                        System.out.printf("Your total tax is: %f \n", tax);
                    } else if (annualSalary <= 64000) {
                        double tax = annualSalary * 0.1;
                        System.out.println("Your tax percentage is: 10%");
                        System.out.printf("Your total tax is: %f \n", tax);
                    } else {
                        double tax = (64000 * 0.1) + ((annualSalary - 64000) * 0.25);
                        System.out.println("Your tax percentage is: 10% upto 64000, 25% over 64000 ");
                        System.out.printf("Your total tax is: %f \n", tax);
                    }
                }
                else {
                    System.out.println("You should enter marital status 'single' or 'married', please try again.");
                }
        }
        else {
            System.out.println("You should enter a number bigger than zero, please try again.");
        }
    }
}

package com.seleniummaster.conditions;

import java.util.Scanner;

public class HomeWorkW7D1_Tax_Swich {
    public static void main(String[] args) {
        int caseNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your annual salary:");
        int annualSalary = input.nextInt();
        System.out.println("Please enter your tax filing status (single/married):");
        String maritalStatus =input.next();
        if (maritalStatus.equalsIgnoreCase("single")) {
            if (annualSalary > 0 && annualSalary <= 32000) {
                caseNumber = 1;
            } else {
                caseNumber = 2;
            }
        } else if (annualSalary > 0 && annualSalary <= 64000) {
            caseNumber=3;
        }else {
            caseNumber=4;
        }
        System.out.println(caseNumber);
        switch (caseNumber) {
            case 1:
                double tax = annualSalary * 0.1;
                System.out.println("Your annual salary is: "+annualSalary);
                System.out.println("Your tax filing status is: "+maritalStatus);
                System.out.println("Your tax percentage is: 10%");
                System.out.println("Your total tax is: "+tax);
                break;
            case 2:
                tax = ((32000 * 0.1) + (annualSalary - 32000) * 0.25);
                System.out.println("Your annual salary is: "+annualSalary);
                System.out.println("Your tax filing status is: "+maritalStatus);
                System.out.println("Your tax percentage is: 10% upto 32000, 25% over 32000 ");
                System.out.println("Your total tax is: "+tax);
                break;
            case 3:
                tax = annualSalary * 0.1;
                System.out.println("Your annual salary is: "+annualSalary);
                System.out.println("Your tax filing status is: "+maritalStatus);
                System.out.println("Your tax percentage is: 10%");
                System.out.println("Your total tax is: "+tax);
                break;
            case 4:
                tax = (64000 * 0.1) + ((annualSalary - 64000) * 0.25);
                System.out.println("Your annual salary is: "+annualSalary);
                System.out.println("Your tax filing status is: "+maritalStatus);
                System.out.println("Your tax percentage is: 10% upto 64000, 25% over 64000 ");
                System.out.println("Your total tax is: "+tax);
                break;
            case 0:
                System.out.println("You entered incorrect value, please try later.");
        }
    }
}

package com.seleniummaster.loops;


import java.math.RoundingMode;
import java.util.Scanner;

public class HomeWork_W7D3_CompoundInterest01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How much do you want to invest?");
        double principalAmount=input.nextInt();
        System.out.println("How many years do you want to invest?");
        int years=input.nextInt();
        double interestRate=0.05;
        double interestAmount;
        double totalMoney=0;
        for (int i=0; i<years; i++) {
            totalMoney=((principalAmount*interestRate)+principalAmount);
            interestAmount=principalAmount*interestRate;
            principalAmount=principalAmount+interestAmount;
        }
        System.out.printf("After %d years invest, the amount of money " +
                "including interest is: %f ", years, totalMoney);

    }
}

package com.seleniummaster.conditions;

import java.util.Scanner;

public class ConditionDemo3 {
    public static void main(String[] args) {
        // score should less than 100
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your score");
        int score=scanner.nextInt();
        if (score>=0&&score<=100) {
            if (score <= 100 && score >= 90) {
                System.out.println("Good job, your grade is 'A'");
            } else if (score < 90 && score >= 80) {
                System.out.println("Your grade is 'B'");
            } else if (score < 80 && score >= 70) {
                System.out.println("Your grade is 'C'");
            } else if (score < 70 && score >= 60) {
                System.out.println("Your grade is 'D'");
            } else if (score < 60) {
                System.out.println("You faild this exam");
            }
        }
        else {
            System.out.println("Invalid score, please try again");
        }




    }
}

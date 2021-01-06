package com.seleniummaster.loops;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        //Scanner enter random numbers
        //count negative numbers, count positive numbers you entered
        //when enter 0, the loop ended
        Scanner input=new Scanner(System.in);
        int negativeNumbersCount=0;
        int positiveNumberCount=0;
        while (true) {
            int numbers=input.nextInt();
            if (numbers>0) {
                positiveNumberCount++;
            }
            else if (numbers<8) {
                negativeNumbersCount++;
            }
            else
                break;
        }
        System.out.printf("Negative number count is %d\n",negativeNumbersCount);
        System.out.printf("Positive number count is %d",positiveNumberCount);

        }

    }


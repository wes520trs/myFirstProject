package com.seleniummaster.conditions;

public class ConditionDemo1 {
    public static void main(String[] args) {
        int a=10;
        int b=50;
        if (a>b) {
            System.out.println(String.format("%d is greater than %d",a,b));

        } else {
            System.out.println(String.format("%d is less than %d", a,b));
        }

        int c=100;
        int d=100;
        if (c==d) {
            System.out.println("c is equal to d");
        } else {
            System.out.println("c is not equal to d");
        }
    }
}

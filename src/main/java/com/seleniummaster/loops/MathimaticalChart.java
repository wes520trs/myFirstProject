package com.seleniummaster.loops;

public class MathimaticalChart {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++) {
            for (int j=1; j<=i; j++) {
                System.out.printf("%d * %d = %d \t",j,i,i*j); //t-table shape
            }
            System.out.println();
        }
    }
}

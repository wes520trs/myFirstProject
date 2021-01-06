package com.seleniummaster.loops;

public class HomeWork_W8D1_Square {
    public static void main(String[] args) {
        System.out.println("Number   Square");
        for (int i=2; i<=20; i++) {
            if (i%2==0) {
                System.out.printf("  %d        %d",i,(int)Math.pow(i,2));
            }
            System.out.println();
        }
    }
}

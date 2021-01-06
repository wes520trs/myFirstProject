package com.seleniummaster.loops;


public class Practice02 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            int j=(int)(Math.random()*10);
            for (int k=0; k<=j; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

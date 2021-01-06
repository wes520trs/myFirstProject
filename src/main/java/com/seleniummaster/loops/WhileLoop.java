package com.seleniummaster.loops;

public class WhileLoop {
    public static void main(String[] args) {
        // 1-100 odd numbers
        int i=0;
        while (i<=100){
            if (i%2!=0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println(i);
    }
}

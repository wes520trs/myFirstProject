package com.seleniummaster.loops;

public class HomeWork_W8D1_SumAndAverage {
    public static void main(String[] args) {
        int r;
        int m=0;
        System.out.println("Random numbers are: ");
        for (int i=0; i<5; i++) {
            r=(int)(Math.random()*50+1);
            System.out.print(r+" ");
            m+=r;
        }
        System.out.println();
        System.out.println("Sum of those 5 numbers is: "+m);
        System.out.println("Average of those 5 numbers is: "+(m/5));

    }
}

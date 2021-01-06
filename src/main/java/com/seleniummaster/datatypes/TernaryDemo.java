package com.seleniummaster.datatypes;

public class TernaryDemo {
    public static void main(String[] args) {
        int m=12;
        int n=15;
        int max=(m>n)?m:n;
        System.out.println(String.format("Max value of %d and %d is %d \n",m,n,max));
        int min=(m<n)?m:n;
        System.out.println(String.format("Min value of %d and %d is %d \n",m,n,min));

        int age=45;
        String Who=(age>50)?"old man":"young man";
        System.out.println(Who);
    }
}

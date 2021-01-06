package com.seleniummaster.datatypes;

public class RandomNumbers03 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
           int j=(int)(Math.random()*100); //0-100
            System.out.print(j+" ");
        }
    }
}

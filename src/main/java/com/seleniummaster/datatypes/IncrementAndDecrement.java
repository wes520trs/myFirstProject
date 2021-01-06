package com.seleniummaster.datatypes;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        // ++ plus one
        // -- minus one
        int i=1;
        int j=i++;
        System.out.println(i);
        System.out.println(j);

        int m=1;
        int n=++m;
        System.out.println(m);
        System.out.println(n);

        int i1=2;
        int j1=i1--;
        System.out.println(i1); //1
        System.out.println(j1); //2

        int m1=3;
        int n1=--m1;
        System.out.println(m1); //2
        System.out.println(n1); //2

        int h=0;
        h+=5;
        h+=5;
        System.out.println(h);
        h*=10;
        System.out.println(h);

    }
}

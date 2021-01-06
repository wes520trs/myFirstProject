package com.seleniummaster.datastructure;

import java.util.Arrays;

public class BubbleSort { //Bubble sort logic/algorithm
    public static void main(String[] args) {
        int[] a={50,20,70,40,100,10};
        for (int i=0; i<a.length-1; i++) {
            for (int j=0; j<a.length-1-i; j++) {
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}

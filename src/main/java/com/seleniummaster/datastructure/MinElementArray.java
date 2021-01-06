package com.seleniummaster.datastructure;


public class MinElementArray {
    public static void main(String[] args) {
        //max number
        int a[]={100,120,200,80,5,300,50,40,190,10};
        int maxNumber=0;
        for (int i=0; i<a.length; i++) {
            if (maxNumber<a[i]) {
                maxNumber=a[i];
            }
        }
        //min number
        int minNumber=maxNumber;
        for (int i=0; i<a.length; i++) {
        if (minNumber>a[i]) {
            minNumber=a[i];
        }
    }
        System.out.println(minNumber);

        //min number without maxnumner
//        int a[]={100,120,200,80,60};
        int minNumber2=0;
        for (int i=0; i<a.length-1; i++) {
            if (a[i]<a[i+1]) {
                a[i + 1] = a[i];
            }
            else {
                a[i] = a[i+1];
            }
            minNumber2 = a[i];
        }
        System.out.println(minNumber2);
    }

}

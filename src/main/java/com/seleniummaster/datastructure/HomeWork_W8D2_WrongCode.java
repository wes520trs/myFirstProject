package com.seleniummaster.datastructure;

import java.util.Arrays;

public class HomeWork_W8D2_WrongCode {
    public static void main(String[] args) {
        double[] values=new double[10];
        for(int i=0;i<=9;i++)
            values[i]=i*i;
        System.out.println(Arrays.toString(values));
        System.out.println(values.toString());
    }
}

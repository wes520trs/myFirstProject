package com.seleniummaster.classconcept;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethod1 {
    public int findMaxNumber(int[] brr) {
        int maxnumber = 0;
        for (int i = 0; i < brr.length; i++) {
            if (maxnumber < brr[i])
                maxnumber = brr[i];
        }
            return maxnumber;
    }
    public static int addThreeNumbers(int i1, int i2, int i3) {
        int sum=i1+i2+i3;
        return sum;
    }
}

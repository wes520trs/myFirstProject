package com.seleniummaster.datastructure;

import java.util.Arrays;

public class CopyTwoArrays {
    public static void main(String[] args) {
        int[] a1={10,45,80,60};
        int[] a2= Arrays.copyOf(a1,6);
        System.out.println(Arrays.toString(a2));
        // int default value is 0, String default value is null
        String[] s1={"A","B","C","D"};
        String[] s2=Arrays.copyOf(s1,4);
        System.out.println(Arrays.toString(s2));
        // manual copy
        int[] arra1={10,20,30,40};
        int[] arra2=new int[arra1.length];
        for (int i=0; i<arra1.length; i++) {
            arra2[i]=arra1[i];
        }
        System.out.println("after copy");
        System.out.println(Arrays.toString(arra2));

    }
}

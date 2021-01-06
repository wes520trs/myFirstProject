package com.onlinecourse.javamethod;

public class Recursion {
    public static int sum(int k){
        if (k>0){
            return k+sum(k-1);
        }else
            return 0;
    }

    public static int sumBetween(int start, int end){
        if (end>start){
            return end+sumBetween(start,end-1);
        }else
            return start;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sumBetween(5,10));
    }
}

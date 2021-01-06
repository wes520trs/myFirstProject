package com.seleniummaster.classconcept;

public class MethodOverLoading {
    public int addTwoNumbers(int i1, int i2){
        int sum=i1+i2;
        return sum;
    }
    public long addTwoNumbers(long i1, int i2){
        long sum=i1+i2;
        return sum;
    }
    public long addTwoNumbers(int i1, long i2){
        long sum=i1+i2;
        return sum;
    }

}

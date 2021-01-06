package com.seleniummaster.classconcept;

import org.codehaus.plexus.util.StringUtils;

public class Calculator {
    // print calculator information
    public void calculatorInfo(){
        System.out.println("Thanks for using this simple calculator.");
        System.out.println("Hope you enjoy using it.");
    }
    // method for adding two numbers
    public int addTwoNumbers(int i1, int i2){
        int sum=i1+i2;
        return sum;
    }
    public long addTwoNumbers(String s1, String s2) {
        if (StringUtils.isNumeric(s1)&&StringUtils.isNumeric(s2))
        {
            long sum=Long.parseLong(s1)+Long.parseLong(s2);
            return sum;
        }
        else {
            System.out.println("Please enter numeric string.");
            return 0;
        }
    }
    // add multiple numbers
    public long addMultipleNumbers(long...numbers) {
        long sum=0;
        for (long eachNumber:numbers
             ) {
            sum=sum+eachNumber;
        }
            return sum;
    }
    public int subtractTwoNumbers(int i1, int i2) {
        int subtract=i1-i2;
        return subtract;

    }
}

package com.seleniummaster.classconcept;

import com.seleniummaster.conditions.MaxNumber;

import java.util.Arrays;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.calculatorInfo();
        System.out.println(c.addTwoNumbers(20,33));
        System.out.println(c.addTwoNumbers(12,44));
        System.out.println(c.addTwoNumbers("45c","34"));
        System.out.println(c.addMultipleNumbers(10,20,30,40,50));
        System.out.println(c.subtractTwoNumbers(100,20));
        System.out.println(c.subtractTwoNumbers(40,90));

        JavaMethod1 n=new JavaMethod1();
        System.out.println(n.findMaxNumber(new int[]{20,30,10,60,33,4440,5894,488}));
        JavaMethod1.addThreeNumbers(19,20,44);


    }
}

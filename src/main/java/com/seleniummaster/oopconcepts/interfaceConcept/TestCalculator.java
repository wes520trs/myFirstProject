package com.seleniummaster.oopconcepts.interfaceConcept;

public class TestCalculator {
    public static void main(String[] args) {
        ISimpleCalculator iSimpleCalculator=new Calculator();
        iSimpleCalculator.addTwoNumbers(10,40);
        iSimpleCalculator.multiplyTwoNumbers(40,5);
        iSimpleCalculator.substractTwoNumbers(20,60);
        iSimpleCalculator.divideTwoNumbers(30,6);


        System.out.println("****Scientific calculator***");
        IScientificCalculator iScientificCalculator=new Calculator();
        System.out.println(iScientificCalculator.calculatePower(10,2));
        System.out.println(iScientificCalculator.calculateAbsoluteValue(-20));
        System.out.println(iScientificCalculator.calculateSquareRoot(81));

    }
}

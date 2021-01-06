package com.seleniummaster.oopconcepts.interfaceConcept;

public class Calculator implements ISimpleCalculator, IScientificCalculator {

    @Override
    public double addTwoNumbers(double d1, double d2) {
        double sum=d1+d2;
        System.out.println(String.format("%.2f+%.3f=%.2f",d1,d2,sum));
        return sum;
    }

    @Override
    public int multiplyTwoNumbers(int i1, int i2) {
        int result=i1*i2;
        System.out.println(String.format("%d*%d=%d",i1,i2,result));
        return result;
    }

    @Override
    public long substractTwoNumbers(long l1, long l2) {
        System.out.println(String.format("%d-%d=%d",l1,l2,l1-l2));
        return l1-l2;
    }

    @Override
    public double divideTwoNumbers(double d1, double d2) {
        if (d2!=0){
            float result=(float)(d1/d2);
            System.out.println(String.format("%.1f/%.1f=%.1f",d1,d2,result));
            return result;
        }
        else {
            System.out.println("Your denominator is zero");
            return 0;
        }
    }

    @Override
    public double calculatePower(int base, int power) {
        double r=Math.pow(base,power);
        return r;
    }

    @Override
    public double calculateSquareRoot(long l1) {
        double s=Math.sqrt(l1);
        return s;
    }

    @Override
    public double calculateAbsoluteValue(int x) {
        double abs=Math.abs(x);
        return abs;
    }
}

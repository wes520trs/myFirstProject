package com.seleniummaster.datatypes;

public class DataTypeConversion {
    public static void main(String[] args) {
        int i1=100;
        long l1=i1;
        System.out.println(String.format("l1=%d",l1));

        int i2=200;
        double d1=i2;
        System.out.println(String.format("d1=%f",d1));

        char c='B';
        int i3=c;
        System.out.println(String.format("i3=%d",i3));

        long l2=4561237895645l;
        int i4=(int)l2;
        System.out.println(String.format("i4=%d",i4));
//        System.out.printf("i4=%d",i4);

//        float f=56.4456f;
//        double r=123.232;

        double d2=12.9;
        int i5=(int)d2;
        System.out.printf("i5=%d",i5);






    }
}

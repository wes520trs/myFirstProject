package com.seleniummaster.datatypes;

public class DataTypeConversion2 {
    public static void main(String[] args) {
        String day="25";
        System.out.println(day+100);

        int i1=Integer.parseInt(day);
        System.out.println(i1+100);

        double d1=Double.parseDouble(day);
        System.out.printf("d1=%f\n",d1);

        float f1=Float.parseFloat(day);
        System.out.printf("f1=%f\n",f1);

        int x=300;
        System.out.println(100+x);
        String x1=String.valueOf(x);
        System.out.println(100+x1);

        int x3=888;
        float f4=456.1234f;
        String s2=String.valueOf(x3);
        String s3=String.valueOf(f4);
        System.out.println(x3+f4);
        System.out.println(s2+s3);

        System.out.println(Integer.toBinaryString(x3));
        System.out.println(Integer.toHexString(111));

        String age="27";
        System.out.println(Integer.valueOf(age));
        int ageNum=Integer.valueOf(age);
        System.out.println(10+ageNum);








    }
}

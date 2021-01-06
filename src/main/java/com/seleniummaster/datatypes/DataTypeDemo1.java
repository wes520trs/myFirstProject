package com.seleniummaster.datatypes;

public class DataTypeDemo1 {
    public static void main(String[] args) {
        // data type
        int x=10;
        double y=3.894564123123122212332123;
        float h=3.892f;
        System.out.println(x);
        System.out.println(y);
        System.out.println(h);
        System.out.println(x>y);

        int a=100;
        int b=5;
        int d=2;
        int c=a*b;
        System.out.println(a*b);
        System.out.println(a+"*"+b + "=" + c);
        System.out.println(String.format("%d * %d = %d",a,b,c));
        System.out.println(String.format("%d / %d = %f",b,d,(float)b/d));

        int k=3;
        int j=5;
        int s=50;
        System.out.println(j);
        System.out.println(j>2&&k<5);
        System.out.println(j>2||k>9);
        System.out.println(!(j>2||k>9));
        System.out.println(Math.max(k,j));
        System.out.printf("the bigger number is %d \n",Math.max(k,j));
        System.out.printf("the smaller number is %d \n",Math.min(k,j));
        System.out.printf("the square root of %d is %f \n",s,Math.sqrt(s));





    }
}

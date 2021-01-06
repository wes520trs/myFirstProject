package com.onlinecourse.classesandobjects;

public class WrapperClassDemo {
    public static void main(String[] args) {
        Integer myNum=100;
        Double myDbl=5.99;
        Character myChar='A';
        System.out.println(myNum);
        System.out.println(myChar);
        System.out.println(myDbl);

        System.out.println(".value mothod:");
        System.out.println(myNum.intValue());
        System.out.println(myChar.charValue());
        System.out.println(myDbl.doubleValue());

        String myStr=myNum.toString();
        Integer strLength=myStr.length();
        System.out.println("String length is: "+strLength);
        System.out.println(myNum+strLength);
        System.out.println(myChar+myStr);
        System.out.println(myNum+myStr);
    }
}

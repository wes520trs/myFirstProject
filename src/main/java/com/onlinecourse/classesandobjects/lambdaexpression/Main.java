package com.onlinecourse.classesandobjects.lambdaexpression;

public class Main {
    public static void printFormatted(String str, StringFunction format){
        String result=format.run(str);
        System.out.println(result);
    }

    public static void main(String[] args) {
        StringFunction exclaim=(s)->s+"!";
        StringFunction ask=(s)->s+"?";
        StringFunction end=(s)->s+".";
        printFormatted("Hello",exclaim);
        printFormatted("Hello",ask);
        System.out.println(ask.run("What"));
        String endSentence=end.run("Ending");
        System.out.println(endSentence);
    }
}

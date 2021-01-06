package com.seleniummaster.datatypes;

public class StringDemo3 {
    public static void main(String[] args) {
        String course="Java selenium test automation courses";
//        System.out.println(course.length());
//        System.out.println(course.indexOf("s"));
//        System.out.println(course.indexOf('s',course.indexOf('s')+1));
//        System.out.println(course.indexOf("s",course.indexOf("s"+1)+1));
//        System.out.println(course.lastIndexOf("s"));
//        System.out.println(course.indexOf("test"));
//        System.out.println(course.toLowerCase());
//        System.out.println(course.replace("Java","Python"));
//        String status="  All I love is you  ";
//        System.out.println(status.length());
//        status=status.trim();
//        System.out.println(status.length());
//        //substring
//        System.out.println(course.substring(5,13));
//        // create accout
//        String date="03-09-2020";
//        date=date.replace("-","/");
//        System.out.println(date);

        System.out.println(course.lastIndexOf("s"));
        System.out.println(course.indexOf("s",course.indexOf("s")+1));
        System.out.println(course.indexOf('s',course.indexOf('s'+2)+1));

        int beginIndex=course.indexOf("s");
        int endIndex=beginIndex+"slenium".length();
        System.out.println(beginIndex);
        System.out.println(endIndex);

//        String s1="Java";
//        String s2="java";
//        String s3="Java is fun";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s3.contains(s1));

        System.out.println("Java \"selenium\" test automation \n courses");














    }
}

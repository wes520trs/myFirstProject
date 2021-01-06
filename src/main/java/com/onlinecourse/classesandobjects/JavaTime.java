package com.onlinecourse.classesandobjects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaTime {
    public static void main(String[] args) {
        LocalDate myDate=LocalDate.now();
        System.out.println("local date is:" +myDate);

        LocalTime myTime=LocalTime.now();
        System.out.println("local time is:"+myTime);

        LocalDateTime myDateTime=LocalDateTime.now();
        System.out.println("Before formatting: "+myDateTime);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("E yy-MM-dd  hh:mm:ss");
        String formattedDateTime=myDateTime.format(dateTimeFormatter);
        System.out.println("After formatted: "+formattedDateTime);
    }
}

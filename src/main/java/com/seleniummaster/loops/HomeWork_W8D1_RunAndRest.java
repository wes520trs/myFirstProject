package com.seleniummaster.loops;

public class HomeWork_W8D1_RunAndRest {
    public static void main(String[] args) {
        int i=1;
        int totalMinute;
        do {
            int restMinute=5*(i-1);
            int runMinute=15*i;
            totalMinute=runMinute+restMinute;
            System.out.println(i+".mile="+totalMinute);
            i++;
        } while (i<=25);
        System.out.println("Total time = "+totalMinute +" minitue");
    }
}

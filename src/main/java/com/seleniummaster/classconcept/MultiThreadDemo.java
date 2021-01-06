package com.seleniummaster.classconcept;

public class MultiThreadDemo {
    public static void main(String[] args) {
        // print 4 massage on the screen parallel
        // define object instance of class
        GreetingPrint g1=new GreetingPrint(("hello java"));
        GreetingPrint g2=new GreetingPrint(("test automation"));
        GreetingPrint g3=new GreetingPrint(("selemium"));
        GreetingPrint g4=new GreetingPrint(("SDET training"));
        // define thread
        Thread t1=new Thread(g1);
        Thread t2=new Thread(g2);
        Thread t3=new Thread(g3);
        Thread t4=new Thread(g4);
        //start the thread
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

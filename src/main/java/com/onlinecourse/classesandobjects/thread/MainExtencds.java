package com.onlinecourse.classesandobjects.thread;

public class MainExtencds extends Thread {
    public static void main(String[] args) {
        MainExtencds thread=new MainExtencds();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run(){
        System.out.println("This code is running in a thread");
    }

//    public void run(){
//        System.out.println("This is third thread.");
//    }

//    public static void main(String[] args) {
//        Main thread=new Main();
//        thread.start();
//        System.out.println("This code is outside of the thread");
//    }

}

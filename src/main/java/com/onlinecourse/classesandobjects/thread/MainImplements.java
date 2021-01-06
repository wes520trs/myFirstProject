package com.onlinecourse.classesandobjects.thread;

public class MainImplements implements Runnable {
    public static void main(String[] args) {
        MainImplements obj=new MainImplements();
        Thread thread=new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }


    public void run() {
        System.out.println("This code is running in a thread");
    }
}

package com.onlinecourse.classesandobjects.thread;

public class Concurrency extends Thread {
    public static int amount=0;

    public static void main(String[] args) {
        Concurrency thread=new Concurrency();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run(){
        amount++;
    }
    //out put will be "0 and 1" or "0 and 2", because of run together and we don not know which one run together
}

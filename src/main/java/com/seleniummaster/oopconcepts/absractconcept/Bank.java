package com.seleniummaster.oopconcepts.absractconcept;

public abstract class Bank {
    int balance=10000;
    final int b=2000;
    final static int t=4000;
    public abstract void loan(); //abstract method
    public void credit(){ //non-abstract method
        System.out.println("bank credit");

    }
    public void debt() {
        System.out.println("bank debt");
    }
}

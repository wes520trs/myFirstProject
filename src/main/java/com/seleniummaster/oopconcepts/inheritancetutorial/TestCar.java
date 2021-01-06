package com.seleniummaster.oopconcepts.inheritancetutorial;

public class TestCar {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.stop();
        bmw.start();
        bmw.theftSafety();
        bmw.refuel();
        System.out.println("*************");

        Car car=new Car();
        car.refuel();
        car.start();
        car.stop();
//        car.theftSafety(); not allowed
        System.out.println("************");

        Car c=new BMW();
        c.stop();
        c.start();
        c.refuel();
//        c.theftSafety(); not allowed

//        BMW a=new Car(); not allowed
//        BMW a=(BMW) new Car(); // this allowed, but Class Cast Exception

        System.out.println("***************");

        Benz benz=new Benz();
        benz.start();

    }
}

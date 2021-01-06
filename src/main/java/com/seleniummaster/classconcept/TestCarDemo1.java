package com.seleniummaster.classconcept;

public class TestCarDemo1 {
    public static void main(String[] args) {
        Car[] cars=new Car[3];
        Car c1=new Car();
        c1.setBrand("Mazda");
        c1.setPrice(45000);
        c1.setYear(2010);
        c1.setColor("White");
        cars[0]=c1;

        Car c2=new Car("Nissan","Japan","Black",2018);
        cars[1]=c2;
        Car c3=new Car("Opel","German","Gray",2012);
        cars[2]=c3;
        for (Car car:cars
             ) {
            System.out.println(car.getBrand()+" "+car.getColor()+" "+car.getPrice());
            System.out.println(car.toString());
            System.out.println(car.CarInfo());
        }
        System.out.println(cars.toString());
        System.out.println();


    }
}

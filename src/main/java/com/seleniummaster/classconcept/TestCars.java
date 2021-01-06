package com.seleniummaster.classconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCars {
    public static void main(String[] args) {
        //define car object - use the keyword 'new'
        Car toyota=new Car(); // referance is car1
        toyota.setBrand("Toyota");
        toyota.setColor("White");
        toyota.setMade("Japan");
        toyota.setMileAge(50000);
        toyota.setPrice(38000);
        toyota.setYear(2015);
        Car benz=new Car();
        benz.setBrand("Benz");
        benz.setColor("Black");
        benz.setMade("German");
        benz.setPrice(59000);
        benz.setMileAge(100000);
        benz.setYear(2007);
        Car honda=new Car();
        honda.setBrand("Honda");
        honda.setMade("Japan");
        honda.setMileAge(150000);
        honda.setColor("Yellow");
        honda.setPrice(290000);

        System.out.println(toyota.getBrand());
        System.out.println(toyota.getMileAge());
        System.out.println(honda.getPrice());

        List<Car> carList=new ArrayList<>();
        carList.add(honda);
        carList.add(benz);
        carList.add(toyota);
        for (Car cars:carList
             ) {
            if (cars.getBrand().equalsIgnoreCase("toyota"))
            System.out.printf("%s %s %s %d %d %d",
                    cars.getBrand(),
                    cars.getColor(),
                    cars.getMade(),
                    cars.getMileAge(),
                    cars.getPrice(),
                    cars.getYear());
//            System.out.println();
        }

    }
}

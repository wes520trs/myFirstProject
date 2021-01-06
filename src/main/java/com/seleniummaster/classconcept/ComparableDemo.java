package com.seleniummaster.classconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Car> carList=new ArrayList<>();
        carList.add(new Car("Toyoya","White",120000));
        carList.add(new Car("Honda","Black",100000));
        carList.add(new Car("BMW","White",150000));
        carList.add(new Car("Volvo","Black",220000));
        System.out.println(carList.toString());

        //comparable interface comparator method
//        carList.sort(Comparator.comparing(Car::getPrice));
//        System.out.println(carList.toString());
//        carList.sort(Comparator.comparing(Car::getPrice).reversed());
//        System.out.println(carList.toString());

        Collections.sort(carList);
        System.out.println(carList.toString());
    }
}

package com.onlinecourse.classesandobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Nissan");
        cars.add("Toyota");
        cars.add("Benz");
        cars.add("Mazda");
        System.out.println(cars);
        for (String i:cars
             ) {
            System.out.print(i+"::");
        }
        System.out.println();
        System.out.println("After sorted");
        Collections.sort(cars);
        for (int i=0; i<cars.size(); i++){
            System.out.print(cars.get(i)+"||");
        }


        System.out.println("\n Integer Arraylist");
        ArrayList<Integer> num=new ArrayList<>();
        num.add(60);
        num.add(20);
        num.add(30);
        num.add(90);
        num.add(80);
        num.add(10);
        System.out.println(num);
        Collections.sort(num);
        System.out.println("after sorted");
        for (int i:num
             ) {
            System.out.print(i+"<");
        }

    }
}

package com.onlinecourse.classesandobjects.lambdaexpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(35);
        num.add(20);
        num.add(80);
        num.add(45);
        Consumer method=((n)->{System.out.println(n);});
        num.forEach(method);
    }
}

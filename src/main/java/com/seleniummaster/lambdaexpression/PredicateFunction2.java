package com.seleniummaster.lambdaexpression;

import java.util.function.Predicate;

public class PredicateFunction2 {
    public static void main(String[] args) {
        // given value is greater than 30 or not
//        Predicate<Integer> predicate=p->(p>30);
        Predicate<Integer> predicate=(p)->(p>30);
        System.out.println(predicate.test(20));
        System.out.println(predicate.test(90));
        System.out.println(predicate.test(30));

        //given String length is greate than 4 or not
        Predicate<String> p1=s -> (s.length()>4);
        System.out.println(p1.test("city"));
        System.out.println(p1.test("country"));
        String names[]={"tom","mike","merry","david"};
        for (String name:names){
            if (p1.test(name)){
                System.out.println(name);
            }
        }
    }
}

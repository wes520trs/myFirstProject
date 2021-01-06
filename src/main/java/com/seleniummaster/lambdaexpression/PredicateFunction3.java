package com.seleniummaster.lambdaexpression;

import java.util.function.Predicate;

public class PredicateFunction3 {
    public static void main(String[] args) {
        int a[]={10,50,35,83,100,44,123};
        Predicate<Integer> p1=p->(p%2==0);
        Predicate<Integer> p2=s->(s>20);
//        Predicate<Integer> p1=p->(p%2==0&&p>20);
//        for (int arr:a
//             ) {
////            if (p1.test(arr)&&p2.test(arr)){
//            if (p1.or(p2).test(arr)){
//                System.out.print(arr+" ");
//            }
//        }
        for (int arr:a){
            if (p1.negate().test(arr)){
                System.out.print(arr+" ");
            }
        }

    }
}

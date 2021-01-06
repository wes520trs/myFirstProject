package com.seleniummaster.lambdaexpression;

//@FunctionalInterface
public interface PredicateFunction1 {
    void book();

}

//class Test implements PredicateFunction1{
//
//    @Override
//    public void book() {
//        System.out.println("Reading Book ... ");
//    }
//}

class testClass{
    public static void main(String[] args) {
//        PredicateFunction1 function1=new Test();
//        function1.book();
        PredicateFunction1 function1=()->System.out.println("Reading book ...");
        function1.book();
    }
}
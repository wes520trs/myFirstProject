package com.seleniummaster.classconcept;

public class NestedClass {  // root class or outer class

    private void print() {
        System.out.println("This is a print statement of the root class");
    }
    class InnerClassA{ //non-static inner class
        private int sum(int a, int b) {
            System.out.printf("%d+%d=%d \n", a, b, a + b);
            return a + b;
        }
            class InnerInnerClassC{ //inside of inside
                private void divide(){
                }
            }
        }
    static class InnerClassB{ //static inner class
       private long multiply(int a, int b){
           System.out.printf("%d*%d=%d",a,b,a*b);
           return a*b;
       }
    }
    public static void main(String[] args) {
        NestedClass nestedClass=new NestedClass();
        nestedClass.print();
        //creating instance of inner class
        //Encapsulation - data hiding
        NestedClass.InnerClassA innerClassA=new NestedClass().new InnerClassA();
        innerClassA.sum(3,2);
//        NestedClass.InnerClassB innerClassB=new InnerClassB().multiply();
        InnerClassB innerClassB=new InnerClassB();
        innerClassB.multiply(4,5);
        NestedClass.InnerClassA.InnerInnerClassC innerInnerClassC=new NestedClass().new InnerClassA().new InnerInnerClassC();
        innerInnerClassC.divide();
    }
}

package com.onlinecourse.sameobjectindifferentclass;

public class Main {
    public static void main(String[] args) {
        GetterAndSetter gs1=new GetterAndSetter();
        AnotherClass copyOfGS=new AnotherClass();

        gs1.setName("Tursun");
        gs1.setAge(36);

        System.out.println("Name from setter: "+gs1.getName());
        System.out.println("Age from setter: "+gs1.getAge());

        copyOfGS.getTheValue(gs1);
    }
}

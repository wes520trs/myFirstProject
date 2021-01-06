package com.onlinecourse.classesandobjects;

public class Constructor {
    int modelYear;
    String modelName;

    public Constructor(){
    }
    public Constructor(int year, String name){
        modelName=name;
        modelYear=year;
    }

    public static void main(String[] args) {
        Constructor myObj=new Constructor(2016,"Casio");
        System.out.println(myObj.modelName+" "+myObj.modelYear);
    }
}

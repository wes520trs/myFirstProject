package com.onlinecourse.classesandobjects.enumclasses;

public class Main {
    public static void main(String[] args) {
        Level myVar=Level.LOW;

        switch (myVar){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        for (Level elemet:Level.values()
             ) {
            System.out.print(elemet+" ");
        }
    }
}

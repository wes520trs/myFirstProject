package com.seleniummaster.classconcept;

import java.util.Date;

public class GreetingPrint implements Runnable{

    private String message;

    public GreetingPrint(String message) {
        this.message=message;
    }

    @Override
    public void run() {
        for (int i=0; i<3; i++) {
            Date date = new Date();
            System.out.println(date + " " + message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

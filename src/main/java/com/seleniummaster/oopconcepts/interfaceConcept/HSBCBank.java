package com.seleniummaster.oopconcepts.interfaceConcept;

public class HSBCBank implements USBank,UKBank {

    @Override
    public void credit() {
        System.out.println("HSBC --- Credit");
    }

    @Override
    public void debt() {
        System.out.println("HSBC --- Debt");
    }

    @Override
    public void tranferMoney() {
        System.out.println("HSBC --- Transfer Money");

    }

    //not override, written by ourself
    public void drawMoney(){
        System.out.println("HSBC --- Draw Money");
    }

    @Override
    public void loan() {
        System.out.println("HSBC --- loan");
    }
}

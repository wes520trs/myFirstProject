package com.seleniummaster.oopconcepts.absractconcept;


import com.seleniummaster.oopconcepts.interfaceConcept.UKBank;
import com.seleniummaster.oopconcepts.interfaceConcept.USBank;

public class ICICBank extends Bank implements USBank, UKBank {

    @Override
    public void loan() {
        System.out.println("bank loan");
    }

    @Override
    public void tranferMoney() {

    }
}

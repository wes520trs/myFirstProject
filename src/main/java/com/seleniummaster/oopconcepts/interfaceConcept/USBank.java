package com.seleniummaster.oopconcepts.interfaceConcept;

public interface USBank {
    // final static by default
    int min_balance=10000;
//    public void credit();      // must be public
    //no method body
    //all method by default is public
    void credit();
    void debt();
    void tranferMoney();

}

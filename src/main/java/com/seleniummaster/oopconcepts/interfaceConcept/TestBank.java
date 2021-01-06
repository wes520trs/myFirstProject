package com.seleniummaster.oopconcepts.interfaceConcept;

public class TestBank {
    public static void main(String[] args) {
        USBank bank=new HSBCBank(); //we cannot insantiate an interface (Create new object)
        bank.credit();
        bank.debt();
        bank.tranferMoney();
        System.out.println(USBank.min_balance);
        UKBank ukBank=new HSBCBank();
        ukBank.loan();


    }
}

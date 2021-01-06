package com.seleniummaster.oopconcepts.absractconcept;

public class BankTest {
    public static void main(String[] args) {
        //cannot create new object
        Bank bank=new ICICBank();
        bank.loan();
        bank.credit();
        bank.debt();
        // bank.b=200; final value
        bank.balance=40000;
        System.out.println(bank.b);
        System.out.println(bank.balance);

    }
}

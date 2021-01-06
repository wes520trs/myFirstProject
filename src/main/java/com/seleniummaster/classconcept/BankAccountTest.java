package com.seleniummaster.classconcept;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccountStatic.setAccountBalance(30000);
        BankAccountStatic.setAccountNumber(478783);
        BankAccountStatic.setAccountName("Kuveytturk");
        BankAccountStatic.getAccountInformation();
        BankAccountStatic.withdrowMoney(50000);

    }
}

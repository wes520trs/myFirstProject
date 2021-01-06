package com.seleniummaster.classconcept;

public class BankAccountStatic {
    private static double accountBalance;
    private static String accountName;
    private static int accountNumber;

    public BankAccountStatic() {
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        BankAccountStatic.accountBalance = accountBalance;
    }

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        BankAccountStatic.accountName = accountName;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        BankAccountStatic.accountNumber = accountNumber;
    }

    // get account information
    public static void getAccountInformation() {
        System.out.println(accountNumber);
        System.out.println(accountName);
        System.out.println(accountBalance);
    }

    //withdraw money
    public static void withdrowMoney(double withdrawMoney) {
        if (withdrawMoney<accountBalance) {
            accountBalance=accountBalance-withdrawMoney;
            System.out.println(accountBalance);
        } else {
            System.out.println("You do not have enough money");
            System.out.println("Your balance is: " +accountBalance);

        }

//        homework
//        driver.findElement(By.xpath("//*[@id=\"general\"]/table[3]/tbody/tr["+i+"]/td[2]/a"));
//
//        driver.findElement(By.xpath("//*[@id=\"general\"]/table[3]/tbody/tr["+i+"]/td[2]/a"));
//        Alert alert=driver.switchTo().alert();
//        alert.accept();//click ok button
//        alert.dismiss();//cancel

    }
}

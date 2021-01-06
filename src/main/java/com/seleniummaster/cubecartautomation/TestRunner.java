package com.seleniummaster.cubecartautomation;

import com.seleniummaster.classconcept.LoginUser;

public class TestRunner extends TestBase{
    public static void main(String[] args) {
        initialization();
        LoginPage loginPage=new LoginPage();
        LoginUser user=new LoginUser("testautomation","automation123!");
        loginPage.login(user);
//        CategoryPage categoryPage=new CategoryPage();
//        categoryPage.addCategory();
//        sleep(3);
        ProductPage productPage=new ProductPage();
        productPage.addProduct();
        sleep(3);
        DeleteProduct delete=new DeleteProduct();
        delete.deleteProduct();
        sleep(3);
        LogoutPage logoutPage=new LogoutPage();
        logoutPage.logOut();
        closeBrowser();



//        initialzation();
//        LoginPage loginPage=new LoginPage();
//        LoginUser user=new LoginUser("testautomation","automation123!");
//        loginPage.login(user);
//        CategoryPage categoryPage=new CategoryPage();
//        categoryPage.addCategory();
//        sleep(3);
//        ProductPage productPage=new ProductPage();
//        productPage.addProduct();
//        sleep(3);
//        DashBoardPage logoutPage=new DashBoardPage();
//        logoutPage.logOut();
//        closeBrowser();






    }
}

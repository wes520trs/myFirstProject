package com.seleniummaster.myproject.sprint1;

import com.seleniummaster.classconcept.LoginUser;

public class TestRunner extends TestBase{
    public static void main(String[] args) throws InterruptedException {
        initialization();
        LoginUser loginUser=new LoginUser("Student","MaharaDemo");
        LoginPage loginPage=new LoginPage();
        loginPage.login(loginUser);

        AddGroupPage addGroupPage=new AddGroupPage();
        addGroupPage.addGroup();

        Thread.sleep(3000);

        UpdateGroupPage updateGroupPage=new UpdateGroupPage();
        updateGroupPage.updateGroup();

        Thread.sleep(3000);

        driver.close();
    }
}

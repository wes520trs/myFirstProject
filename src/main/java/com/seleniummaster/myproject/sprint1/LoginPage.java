package com.seleniummaster.myproject.sprint1;

import com.seleniummaster.classconcept.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends TestBase {
    public void login(LoginUser user){
        driver.get("https://demo.mahara.org/");
        WebElement usernameField=driver.findElement(By.name("login_username"));
//        waitForElementPresent(usernameField,5);
        usernameField.sendKeys(user.getUserName());
        WebElement passwordField=driver.findElement(By.name("login_password"));
        waitForElementPresent(passwordField,5);
        passwordField.sendKeys(user.getPassWord());
        WebElement loginButton=driver.findElement(By.name("submit"));
        loginButton.click();
    }
}

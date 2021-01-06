package com.seleniummaster.cubecartautomation;

import com.seleniummaster.classconcept.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends TestBase {
    public void login (LoginUser user) {
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?");
        WebElement userNameBox = driver.findElement(By.id("username"));
        waitForElementPresent(userNameBox, 5);
        userNameBox.sendKeys(user.getUserName());
        WebElement passWordBox = driver.findElement(By.id("password"));
        waitForElementPresent(passWordBox,5);
        passWordBox.sendKeys(user.getPassWord());
        WebElement loginButton = driver.findElement(By.id("login"));
        waitForElementPresent(loginButton,5);
        loginButton.click();
    }
}

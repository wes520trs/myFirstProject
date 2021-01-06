package com.seleniummaster.classconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaharaLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver.get("https://demo.mahara.org/");
            LoginUser user=new LoginUser();
            user.setUserName("admin");
            user.setPassWord("MaharaDemo");
            WebElement userNameField=driver.findElement(By.name("login_username"));
            userNameField.sendKeys(user.getUserName());
            WebElement passWordField=driver.findElement(By.name("login_password"));
            passWordField.sendKeys(user.getPassWord());
            WebElement loginButton=driver.findElement(By.name("submit")); //log in
            loginButton.click();
    }
}

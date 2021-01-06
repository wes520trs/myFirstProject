package com.seleniummaster.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaharaUtility {
    WebDriver driver;

    public void logIn(String roleName){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org/");
        WebElement userNameField=driver.findElement(By.name("login_username"));
        userNameField.sendKeys(roleName);
        WebElement passWordField=driver.findElement(By.name("login_password"));
        passWordField.sendKeys("MaharaDemo");
        WebElement loginButton=driver.findElement(By.name("submit"));
        loginButton.click();
        WebElement mainMenu=driver.findElement(By.xpath("/html/body/header/div/div/div[2]/button[1]/span[2]"));
        if (mainMenu.isDisplayed()){
            System.out.println("Login successfully.");
        }else {
            System.out.println("Login failed.");
        }
    }
}

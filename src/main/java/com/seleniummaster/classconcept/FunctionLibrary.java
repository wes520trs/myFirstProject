package com.seleniummaster.classconcept;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctionLibrary {
    WebDriver driver;
    public void openBrowser(String siteURL) {
            System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver.get(siteURL);
    }
    public void logIn(LoginUser user) {
        WebElement userNameBox=driver.findElement(By.id("username"));
        userNameBox.sendKeys(user.getUserName());
        WebElement passWordBox= driver.findElement(By.id("password"));
        passWordBox.sendKeys(user.getPassWord());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }

    public void logIn(String username, String password) {
        WebElement userNameBox = driver.findElement(By.id("username"));
        userNameBox.sendKeys(username);
        WebElement passWordBox = driver.findElement(By.id("password"));
        passWordBox.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }


        public boolean verifyLogin() {
        WebElement logoutLink=driver.findElement(By.xpath("//div[@id=\"dashboard\"]/h3"));
        if (logoutLink.isDisplayed()) {
            System.out.println("Login successfully.");
            return true;
        }
        else {
            System.out.println("Login failed.");
            return false;
        }
    }

    public void addProduct(String productName, String weight){
        WebElement productsLink=driver.findElement(By.id("nav_products"));
        productsLink.click();
        WebElement addProdcutLink=driver.findElement(By.xpath("//*[text()='Add Product']"));
        addProdcutLink.click();
        driver.findElement(By.id("name")).sendKeys(productName);
        driver.findElement(By.id("product_weight")).sendKeys(weight);
        driver.findElement(By.xpath("//input[@value='Save']")).click();
    }


    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}

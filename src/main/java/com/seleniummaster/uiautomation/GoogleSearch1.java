package com.seleniummaster.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch1 {
    public static void main(String[] args) throws InterruptedException {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.google.com");
        //find search box
        WebElement searchBox=driver.findElement(By.name("q"));
        Thread.sleep(5000);
        searchBox.sendKeys(args[1]+ Keys.ENTER);
        WebElement searchResult=driver.findElement(By.id("result-stats"));
        if (searchResult.isDisplayed()) {
            System.out.println("Google search test pass");
        }
        else
            System.out.println("Test failed");
        driver.close();
        driver.quit();

    }
}

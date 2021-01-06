package com.seleniummaster.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch3 {
    public static void main(String[] args) throws InterruptedException {
        //define chrome driver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chrome driver object instance
        WebDriver driver=new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //open google site
        driver.get("https://www.google.com");
        int sum=0;
        for (int i=0; i<4; i++) {
            //find search box
            WebElement searchBox = driver.findElement(By.name("q"));
            Thread.sleep(1000);
            searchBox.sendKeys(args[i] + Keys.ENTER);
            Thread.sleep(1000);
            driver.navigate().back();
            sum++;
            System.out.printf("You have searched the key word: %s \n",args[i]);
        }
        System.out.printf("You searh %d key words on the Google",sum);
        driver.close();
        driver.quit();

    }
}

package com.seleniummaster.uiautomation;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        String[] products={"Iphone","Ipad","Samsung","Mac"};
        List<String> products=new ArrayList<>();
        products.add("Iphone");
        products.add("Ipad");
        products.add("Samsung");
        products.add("Mac");
        StopWatch watch=new StopWatch();
        watch.start();
        for (String keyWords:products
             ) {
            WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(keyWords+ Keys.ENTER);
            driver.navigate().back();
        }
        watch.stop();
        System.out.println("Time = " +watch);
        driver.quit();
    }
}

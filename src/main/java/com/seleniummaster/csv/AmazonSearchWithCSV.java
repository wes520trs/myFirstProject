package com.seleniummaster.csv;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonSearchWithCSV {
    public static void main(String[] args) {
        CSVFileUtility csvFileUtility=new CSVFileUtility();
        List<String> searchWord=csvFileUtility.readCSVFile("Test result","amazon-products.csv",
                "searchwords");
        System.out.println(searchWord);
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        String[] products={"Iphone","Ipad","Samsung","Mac"};

        StopWatch watch=new StopWatch();
        watch.start();
        for (String keyWords:searchWord
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

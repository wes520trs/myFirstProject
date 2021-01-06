package com.seleniummaster.uiautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_FlightSite {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //From
        Thread.sleep(1000);
        driver.findElement(By.linkText("Kochi (COK)")).click(); //Kochi
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click(); //To
        Thread.sleep(1000);
        driver.findElement(By.linkText("Delhi (DEL)")).click(); //Delhi
        driver.findElement(By.id("ctl00_mainContent_view_date1")).click(); //Date
        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[contains(text(),'30')]")).click();
        driver.findElement(By.linkText("30")).click();
        driver.findElement(By.id("divpaxinfo")).click(); // PASSANGERS droplist
        Thread.sleep(1000);
        for (int i=0; i<1; i++) {
            Thread.sleep(500);
            WebElement adultPlusIcon=driver.findElement(By.id("hrefIncAdt"));
            adultPlusIcon.click();
            Thread.sleep(500);
            WebElement childPlusIcon=driver.findElement(By.id("hrefIncChd"));
            childPlusIcon.click();
            Thread.sleep(500);
            WebElement infantPlusIcon=driver.findElement(By.id("hrefIncInf"));
            infantPlusIcon.click();
            System.out.println(i);
        }
        Thread.sleep(1000);
        driver.findElement(By.id("btnclosepaxoption")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        Thread.sleep(2000);
//        driver.close();
    }
}

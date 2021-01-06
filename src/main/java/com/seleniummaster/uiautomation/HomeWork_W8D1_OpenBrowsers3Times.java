package com.seleniummaster.uiautomation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeWork_W8D1_OpenBrowsers3Times {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        for (int i=0; i<3; i++) {
            ChromeOptions options=new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com.");
            Thread.sleep(2000);
            driver.close();
            System.out.println(i+1+".time open/close finished successfully.");
        }
    }
}

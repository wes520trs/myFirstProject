package com.seleniummaster.elementlocate;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenPage {
    public static WebDriver driver;
    public void openWebPage(String webAddress){
            System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get(webAddress);
    }
    public void waitForElementPresent(WebElement element, int timeOut){
        WebDriverWait wait=new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

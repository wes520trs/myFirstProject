package com.seleniummaster.elementlocate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class XpathDemo2 extends OpenPage{
    public static void main(String[] args) throws InterruptedException {
        OpenPage openPage = new OpenPage();
        openPage.openWebPage("https://www.prolific.co/p/?ref=0C81TKQF");
        Thread.sleep(3000);

//        WebElement checkSample=driver.findElement(By.xpath("//a[@class='nav-item' & text()='Check Sample']"));
        WebElement checkSample=driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div/div[2]/a[1]"));
//        WebElement checkSample=driver.findElement(By.xpath("//a[contains(@href,'check-sample')]"));
//        WebElement checkSample=driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[1]/a"));
        checkSample.click();

//        //on the first page
//        WebElement signUpToParticipate=driver.findElement(By.xpath("//a[@class='p-button p-button--hero_green_solid p-button--large']"));
//        signUpToParticipate.click();

//        // to help center
//        WebElement helpCenter=driver.findElement(By.xpath("//a[@class='nav-item push-left']"));
//        openPage.waitForElementPresent(helpCenter,5);
//        helpCenter.click();
//        Thread.sleep(5000);

        //on the helpCenter page
//        WebElement searchBox=driver.findElement(By.xpath("//*[@id=\"query\"]"));
//        openPage.waitForElementPresent(searchBox,5);
//        searchBox.click();
//        searchBox.sendKeys("Student"+ Keys.ENTER);
//        WebElement visit=driver.findElement(By.xpath("//a[@class='topbar__link.prolific-help-centre-cross-link']"));
//        openPage.waitForElementPresent(visit,3);
//        visit.click();


    }
}

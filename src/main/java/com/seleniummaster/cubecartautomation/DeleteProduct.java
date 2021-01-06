package com.seleniummaster.cubecartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeleteProduct extends TestBase {
    public void deleteProduct(){
        WebElement productTable=driver.findElement(By.xpath("//*[@id=\"general\"]/table[3]"));
        List<WebElement> listOfRaw=productTable.findElements(By.tagName("tr"));
        System.out.println("The size of list is:" +listOfRaw.size());
//        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        for (int i=0; i<listOfRaw.size()-1; i++) {
            if (listOfRaw.get(i).getText().contains("ts997")) {
                System.out.println("Row content is: "+listOfRaw.get(i).getText());
                WebElement deleteIcon=driver.findElement(By.xpath
                        ("//*[@id=\"general\"]/table[3]/tbody/tr["+i+"]/td[11]/a[@class='delete']/i[@class='fa fa-trash']"));
//              javascriptExecutor.executeScript("arguments[0].scrollIntoView();",deleteIcon);
                waitForElementPresent(deleteIcon,5);
                deleteIcon.click();
                sleep(3);
                driver.switchTo().alert().accept();
                sleep(5);
                break;
            }
        }
    }
}

package com.seleniummaster.myproject.sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddGroupPage extends TestBase{
    public boolean addGroup (){
        WebElement mainMenu=driver.findElement(By.xpath("/html/body/header/div/div/div[2]/button[1]/span[2]"));
//        waitForElementPresent(mainMenu,5);
        mainMenu.click();
        WebElement engage=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[4]/a"));
        waitForElementPresent(engage,5);
        engage.click();
        WebElement group=driver.findElement(By.xpath("//*[@id=\"childmenu-3\"]/li[2]/a"));
        waitForElementPresent(group,5);
        group.click();
        WebElement createGroup=driver.findElement(By.xpath("//*[@id=\"main-column-container\"]/div[2]/a"));
//        waitForElementPresent(createGroup,5);
        createGroup.click();
        WebElement groupNameField=driver.findElement(By.name("name"));
        waitForElementPresent(groupNameField,5);
        groupNameField.sendKeys("Java Project: "+Math.abs((int)(Math.random()*100-50)));

        //swicth to frame
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"editgroup_description_ifr\"]")));
        WebElement groupdescription=driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        waitForElementPresent(groupdescription,5);
        groupdescription.sendKeys("Project begin.");
        //switch out frame
        driver.switchTo().defaultContent();

        WebElement saveGroup=driver.findElement(By.id("editgroup_submit"));
//        waitForElementPresent(saveGroup,5);
        saveGroup.click();

        //verify
        WebElement addedSuccessfully=driver.findElement(By.xpath("//*[@id=\"messages\"]/div/div"));
        waitForElementPresent(addedSuccessfully,5);
        if (addedSuccessfully.getText().equalsIgnoreCase("Group saved successfully")) {
            System.out.println("A new group created successfully.");
            return true;
        }
        else{
                System.out.println("A new group did not created.");
                return false;
            }
    }
}

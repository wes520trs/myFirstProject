package com.seleniummaster.myproject.sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UpdateGroupPage extends TestBase{
    //xpath
    //*[@id="grouplist_3"]/div/div[1]/h2/a
    //*[@id="grouplist_2"]/div/div[1]/h2/a
    //*[@id="grouplist_9"]/div/div[1]/h2/a
    //*[@id="grouplist_9"]/div/div[1]/h2/a

    //selector
    // #grouplist_9 > div > div.col-md-8 > h2 > a

    //html
    //<a href="https://demo.mahara.org/group/unitedcoder">unitedCoder</a>

    //*[@id="grouplist_11"]/div/div[2]/div/div/a[2]/span[2]
    //*[@id="grouplist_10"]/div/div[2]/div/div/a[2]/span[2]
    //document.querySelector("#grouplist_2 > div > div.col-md-8 > h2 > a")


    public boolean updateGroup(){
        WebElement myGroup = driver.findElement(By.xpath("//*[@id=\"groups\"]/div/a"));
        myGroup.click();
        WebElement groupSetting=driver.findElement(By.xpath("//*[@id=\"grouplist_12\"]/div/div[2]/div/div/a[2]/span[2]"));
        groupSetting.click();

        //swicth to frame
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"editgroup_description_ifr\"]")));
        WebElement groupdescription=driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
        waitForElementPresent(groupdescription,5);
        groupdescription.clear();
        groupdescription.sendKeys("Project complete.");
        //switch out frame
        driver.switchTo().defaultContent();

        WebElement saveGroup=driver.findElement(By.id("editgroup_submit"));
//        waitForElementPresent(saveGroup,5);
        saveGroup.click();

        //verify
        WebElement updatedSuccessfully=driver.findElement(By.xpath("//*[@id=\"messages\"]/div/div"));
        waitForElementPresent(updatedSuccessfully,5);
        if (updatedSuccessfully.getText().equalsIgnoreCase("Group saved successfully")) {
            System.out.println("The group updated successfully.");
            return true;
        }
        else{
            System.out.println("The group did not updated.");
            return false;
        }
    }
}

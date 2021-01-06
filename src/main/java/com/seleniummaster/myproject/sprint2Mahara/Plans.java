package com.seleniummaster.myproject.sprint2Mahara;

import com.seleniummaster.myproject.ProjectUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Plans extends MaharaLogin {
    public static void addPlan(String planName, String description) {
        WebElement mainMenu=driver.findElement(By.xpath("/html/body/header/div/div/div[2]/button[1]/span[2]"));
        mainMenu.click();
        WebElement createButton=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
        createButton.click();
        WebElement plansButton=driver.findElement(By.xpath("//*[@id=\"childmenu-1\"]/li[5]/a"));
        ProjectUtility.sleep(1); //wait for the main menu display
        plansButton.click();
        WebElement newPlan=driver.findElement(By.xpath("//*[@id=\"main-column-container\"]/div[2]/a"));
        newPlan.click();
        WebElement planTitle=driver.findElement(By.id("addplan_title"));
        planTitle.sendKeys(planName);
        WebElement plandescription=driver.findElement(By.id("addplan_description"));
        plandescription.sendKeys(description);
        WebElement savePlan=driver.findElement(By.id("addplan_submit"));
        savePlan.click();

        WebElement successfulMassage=driver.findElement(By.xpath("//*[@id=\"messages\"]/div/div"));
        String massage=successfulMassage.getText();
        if (massage.equalsIgnoreCase("Plan saved successfully.")){
            System.out.println("Student's plan created successfully.");
        }else {
            System.out.println("Plan can not created.");
        }


    }
}

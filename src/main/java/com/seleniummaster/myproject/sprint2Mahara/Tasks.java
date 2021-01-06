package com.seleniummaster.myproject.sprint2Mahara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tasks extends Plans {
    public void addTasks(String taskTitle, String beginDate, String endDate, String description) {
        WebElement newTasks = driver.findElement(By.xpath("//*[@id=\"main-column-container\"]/div[2]/a"));
        newTasks.click();
        WebElement title = driver.findElement(By.id("edittask_title"));
        title.sendKeys(taskTitle);
        WebElement startDate = driver.findElement(By.id("edittask_startdate"));
        startDate.sendKeys(beginDate);
        WebElement copmpletionDate = driver.findElement(By.id("edittask_completiondate"));
        copmpletionDate.sendKeys(endDate);
        WebElement taskdescription = driver.findElement(By.id("edittask_description"));
        taskdescription.sendKeys(description);
        WebElement saveTask = driver.findElement(By.id("edittask_submit"));
        saveTask.click();

        WebElement successfulMassage = driver.findElement(By.xpath("//*[@id=\"messages\"]/div/div"));
        String massage = successfulMassage.getText();
        if (massage.equalsIgnoreCase("Task saved successfully.")) {
            System.out.println("Task created successfully.");
        } else {
            System.out.println("Task not created.");
        }
    }
    public void editTasks(String newTitle, String beginDate, String endDate, String newDescription){
        WebElement editIcon=driver.findElement(By.xpath("//*[@id=\"taskslist\"]/tbody/tr[3]/td[5]/div/div[1]/a[1]/span[1]"));
        editIcon.click();
        WebElement title = driver.findElement(By.id("edittask_title"));
        title.clear();
        title.sendKeys(newTitle);
        WebElement startDate = driver.findElement(By.id("edittask_startdate"));
        startDate.clear();
        startDate.sendKeys(beginDate);
        WebElement copmpletionDate = driver.findElement(By.id("edittask_completiondate"));
        copmpletionDate.clear();
        copmpletionDate.sendKeys(endDate);
        WebElement taskdescription = driver.findElement(By.id("edittask_description"));
        taskdescription.clear();
        taskdescription.sendKeys(newDescription);
        WebElement saveTask = driver.findElement(By.id("edittask_submit"));
        saveTask.click();

        WebElement successfulMassage = driver.findElement(By.xpath("//*[@id=\"messages\"]/div/div"));
        String massage = successfulMassage.getText();
        if (massage.equalsIgnoreCase("Task saved successfully.")) {
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Task not updated.");
        }
    }

    public void viewTasks(String firstTitle, String secondTitle, String lastTitle){
        WebElement task01=driver.findElement(By.xpath("//*[@id=\"taskslist\"]/tbody/tr[1]/td[2]/div"));
        String title01=task01.getText();
        WebElement task02=driver.findElement(By.xpath("//*[@id=\"taskslist\"]/tbody/tr[2]/td[2]/div"));
        String title02=task02.getText();
        WebElement task03=driver.findElement(By.xpath("//*[@id=\"taskslist\"]/tbody/tr[3]/td[2]/div"));
        String title03=task03.getText();

        System.out.println("Task Titles: "+title01+" "+title02+" "+title03);

        if (
                title01.equalsIgnoreCase(firstTitle)&&
                title02.equalsIgnoreCase(secondTitle)&&
                title03.equalsIgnoreCase(lastTitle)
        ) {
            System.out.println("Tasks are viewed successfully.");
        }else {
            System.out.println("Tasks can not be viewed.");
        }

    }
}


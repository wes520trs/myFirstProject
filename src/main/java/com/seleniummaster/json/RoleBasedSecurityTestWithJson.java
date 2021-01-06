package com.seleniummaster.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoleBasedSecurityTestWithJson {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?");
        // for getting the start time
        TestResult testResult=new TestResult();
        String startTime=TestHelper.getToday()+"  "+TestHelper.getCurrentTime();
        testResult.setTestStartTime(startTime);
        // for current user
        testResult.setTestExcutedBy(TestHelper.getCurrentUser());

        ObjectMapper mapper=new ObjectMapper();
//        Users loginUser=mapper.readValue(new File("testdata/users.json"),Users.class);
        Users loginUser= null;
        try {
            loginUser = mapper.readValue(new File("testdata/users.json"), Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<TestResultObject> testResultObjects=new ArrayList<>();
        List<User> users=loginUser.getUsers();
        for (User user:users) {
            if (user.isActive()) {
                TestResultObject testResultObject = new TestResultObject();
                testResultObject.setTestModule("Login");
                testResultObject.setTestName("Login");
                String testDate = TestHelper.getToday();
                testResultObject.setTestDate(testDate);
                String testTime = TestHelper.getCurrentTime();
                testResultObject.setTestTime(testTime);

                WebElement userNameBox = driver.findElement(By.id("username"));
                waitForElementPresent(userNameBox, driver);
                String userName = user.getUsername();
                userNameBox.sendKeys(userName);
                WebElement passWordBox = driver.findElement(By.id("password"));
                waitForElementPresent(passWordBox, driver);
                String password = user.getPassword();
                passWordBox.sendKeys(password);
                WebElement loginButton = driver.findElement(By.id("login"));
                waitForElementPresent(loginButton, driver);
                loginButton.click();

                WebElement productLink = driver.findElement(By.id("nav_products"));
                if (productLink.isDisplayed()) {
                    System.out.println("Login test passed");
                    testResultObject.setTestStatus(true);
                } else {
                    System.out.println("Login test failed");
                    testResultObject.setTestStatus(false);
                }
                WebElement logOutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
                waitForElementPresent(logOutIcon, driver);
                logOutIcon.click();
                Thread.sleep(3000);
            }
        }
        driver.close();
        testResult.setTestEndTime(TestHelper.getToday()+"  "+TestHelper.getCurrentTime());
        testResult.setTestResultObjectlist(testResultObjects);
        ObjectMapper mapper1=new ObjectMapper();
//        mapper1.writeValue(new File("testdata/login-test-result.json"),testResult);
        try {
            mapper1.writeValue(new File("testdata/login-test-result.json"),testResult);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void waitForElementPresent(WebElement element, WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}


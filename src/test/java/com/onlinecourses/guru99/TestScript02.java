package com.onlinecourses.guru99;

/*
Time to create a more professional scripts
1- All parameters will be saved in File.Util.java - Helps in easy code maintenance
2- We will move the code to launch Webdriver in a separate method as SetUp. Helps in code understanding
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestScript02 {

    static WebDriver driver; //selenium control driver
    private static String baseUrl; //base url of website guru99

    // This method SetUp will read initialization parameters from class Util.java and launch firefox

    public static void setUp() throws Exception{

        /*	 Tells the Selenium client library to connect to the Webdriver
         * service using firefox
         * In some PC's, Selenium can not find the binary file of Firefox because
         * user doesn't install Firefox at its default location. We need to tell
         * Selenium where the firefox.exe is */

        File pathToBinary=new File(Util.FIREFOX_PATH);
        FirefoxBinary ffBinary=new FirefoxBinary(pathToBinary);

        /*
         * Create new firefoxProfile for Testing
         * A profile in Firefox is a collection of bookmarks, browser settings,
         * extensions, passwords, and history; in short, all of your personal
         * settings. Firefox uses a DEFAULT profile to store all of your
         * personal settings.
         * In this case, we use Firefox for "testing" purpose not as an "end user".
         * We need to create NEW firefoxProfile because we want to separate the
         * Firefox profile for testing purpose and that of an end user. If
         * something wrong happens with the testing, you still have your DEFAULT
         * profile to fall back to (your personal data still safe).
         */

        FirefoxProfile firefoxProfile=new FirefoxProfile();
        System.setProperty("webdriver.gecko.driver",Util.FIREFOX_PATH);
        driver=new FirefoxDriver();

        baseUrl=Util.BASE_URL;

        driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
        driver.get(baseUrl+"/V4/");

    }

    public static void main(String[] args) throws Exception {

        String username, password;
        String actualTitle;
        String actualBoxTitle;

        setUp();

        driver.findElement(By.name("uid")).clear();
        driver.findElement(By.name("uid")).sendKeys(Util.USER_NAME);

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(Util.PASSWORD);

        driver.findElement(By.name("btnLogin")).click();

        actualTitle=driver.getTitle();
        if (actualTitle.contains(Util.EXPECT_TITLE)) {
            System.out.println("Test case: Passed");
        }else {
            System.out.println("Test case: Failed");
        }

        driver.close();






    }
}

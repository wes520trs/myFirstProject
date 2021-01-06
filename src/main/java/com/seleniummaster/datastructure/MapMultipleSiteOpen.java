package com.seleniummaster.datastructure;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MapMultipleSiteOpen {
    public static void main(String[] args) throws InterruptedException {
        Map<String,String> sites=new HashMap<>();
        sites.put("Google","https://www.google.com");
        sites.put("Amazon","https://www.amazon.com");
        sites.put("Youtube","https://www.youtube.com");
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Set<String> set=sites.keySet();
        for (String site:set
             ) {
            StopWatch watch=new StopWatch();
            watch.start();
            driver.get(sites.get(site));
            Thread.sleep(2000);
            watch.stop();
            System.out.println(site +" opened in "+watch.getTime(TimeUnit.MILLISECONDS)+" mil_second.");
            if (driver.getTitle().contains(site)) {
                System.out.println(site + " opened successfully, test pass.");
            }
            else
            System.out.println(site+" can not opened, test failed");
            System.out.println();
        }
        driver.quit();
    }
}

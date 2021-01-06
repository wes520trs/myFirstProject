package com.seleniummaster.configutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestConfig {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream inputStream=new FileInputStream("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\config.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("qaurl"));
        System.out.println("before change "+properties.getProperty("qa"));
        // only read
        properties.setProperty("qa","2");
        System.out.println("after change "+properties.getProperty("qa"));

        //write over
        FileOutputStream outputStream=new FileOutputStream("C:\\Users\\TUERXUN\\IdeaProjects\\SeleniumTestAutomation\\config.properties");
        properties.store(outputStream,null);




    }
}

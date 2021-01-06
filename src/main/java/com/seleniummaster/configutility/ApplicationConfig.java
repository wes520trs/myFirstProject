package com.seleniummaster.configutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfig {
    // write a method to read a specific key value pair from config file
    public static String readConfigProperties(String fileName, String key){
        Properties prop=new Properties();
        String workingDirectoyr=System.getProperty("user.dir");
        String value;
//        prop.load(new FileInputStream(workingDirectoyr+ File.separator+fileName));
        try {
            prop.load(new FileInputStream(workingDirectoyr+ File.separator+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        FileInputStream stream=new FileInputStream(workingDirectoyr+ File.separator+fileName);
//        prop.load(stream);
        value=prop.getProperty(key);
        System.out.println(String.format("%s=%s",key,value));
        return value;
    }
}

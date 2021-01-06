package com.onlinecourse.io;

import org.openqa.selenium.json.Json;
import org.openqa.selenium.json.JsonInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;

public class ReadJsonFileDemo1 {



    public static void readJson(String fileName){
        //current project folder
        String workingDir=System.getProperty("user.dir");
        //define a file path for Json file folder
        String filePath=workingDir+ File.separator;
        System.out.println(filePath);
        //define input stream for the Json file
        InputStream inputStream=null;
        //define Json reader
        JsonInput jsonInput=null;
        //define Json object
        Json json=null;

        try {
            inputStream=new FileInputStream(filePath+fileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

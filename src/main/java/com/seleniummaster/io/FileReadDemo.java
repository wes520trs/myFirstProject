package com.seleniummaster.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        File fileToRead=new File("Test result"+File.separator+"myFile.txt");
        String fileContent=null;
        try {
            fileContent= FileUtils.readFileToString(fileToRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileContent);
    }
}

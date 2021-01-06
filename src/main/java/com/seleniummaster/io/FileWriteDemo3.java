package com.seleniummaster.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo3 {
    public static void main(String[] args) {
        // append content to an existing file
        StringBuilder builder=new StringBuilder();
        builder.append("test \n");
        builder.append("auto \n");
        File existingFile=new File("Test result"+File.separator+"myFile.txt");
        try {
            FileUtils.writeStringToFile(existingFile,builder.toString(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

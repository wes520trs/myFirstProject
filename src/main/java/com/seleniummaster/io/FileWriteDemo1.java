package com.seleniummaster.io;

import net.bytebuddy.utility.RandomString;

import java.io.IOException;
import java.util.Random;

public class FileWriteDemo1 {
    public static void main(String[] args) throws IOException {
        FileUtility fileUtility=new FileUtility();
        StringBuilder fileContent=new StringBuilder();
        fileContent.append("I love coding in Java! \n");
        fileContent.append("Java coding is fun. \n");
        fileContent.append("Java test automation demo. \n");
        fileContent.append("Test passed. \n");
        fileContent.append("New file!!! \n");

        fileUtility.writeToFile("test-result","result123",".txt",fileContent.toString());
        //if file exist, we can use  if (!file.exists())  to avoid overwriting
    }
}

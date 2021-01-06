package com.seleniummaster.io;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;
import java.time.DateTimeException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        String content="test pass.";
        //define time stamp for the file
        DateTime date=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SS");
        String timeStamp=date.toString(formatter);
        String fileName="test"+timeStamp+".txt";
        File myFile=new File("Test result"+File.separator+fileName);
//        FileUtils.writeStringToFile(myFile,content);
        try {
            FileUtils.writeStringToFile(myFile,content);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

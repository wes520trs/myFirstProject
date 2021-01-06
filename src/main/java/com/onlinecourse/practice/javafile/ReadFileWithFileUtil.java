package com.onlinecourse.practice.javafile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ReadFileWithFileUtil {
    public static void main(String[] args) {
        File file=new File("Practice\\mySecondFile.txt");
        // using FileUtils to read directly from file and convert to String
//        String content= FileUtils.readFileToString(file);
        String content= null;
        try {
            content = FileUtils.readFileToString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);

        //more information about file
        if (file.exists()){
            System.out.println("File name: "+file.getName());
            System.out.println("File size: "+file.length());
            System.out.println("Readable: "+file.canRead());
            System.out.println("Writeable: "+file.canWrite());
            System.out.println("Absolute path: "+file.getAbsolutePath());
        }else
            System.out.println("The file does not exist.");
    }
}

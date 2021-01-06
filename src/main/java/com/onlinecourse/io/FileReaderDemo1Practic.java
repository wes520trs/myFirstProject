package com.onlinecourse.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1Practic {
    public static void main(String[] args) {
        System.out.println(readToString01("Test"+File.separator+"login.csv"));
    }


    public static String readToString01(String fileToText01) {
        String workingDir=System.getProperty("user.dir");
        StringBuilder fileContent=new StringBuilder();
        File file=new File(workingDir+File.separator);
        System.out.println(file);
        System.out.println(workingDir);

        try {
            FileReader fileReader=new FileReader(fileToText01);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String isCurrentLine;
            while ((isCurrentLine=bufferedReader.readLine())!=null){
                fileContent.append(isCurrentLine).append("\n");
            }
        }catch (IOException e) {
            System.out.println("Can not read the file.");
        }
        return fileContent.toString();
    }
}

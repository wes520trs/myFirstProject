package com.onlinecourse.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    public static void main(String[] args) {
        System.out.println(readToString("Test\\myFile.txt"));
    }


    public static String readToString(String fileToText){
        String workingDir=System.getProperty("user.dir");
        StringBuilder fileContent=new StringBuilder();
        File file=new File(workingDir+File.separator);
        System.out.println(file);
        System.out.println(workingDir);

        try {
            FileReader fr=new FileReader(file+File.separator+fileToText);
            BufferedReader br=new BufferedReader(fr);
            String isCurrentline;
            while ((isCurrentline=br.readLine())!=null){
                fileContent.append(isCurrentline).append("\n");
            }
        }catch (IOException e){
            System.out.println("Can not read the text file.");
        }
        return fileContent.toString();
    }
}

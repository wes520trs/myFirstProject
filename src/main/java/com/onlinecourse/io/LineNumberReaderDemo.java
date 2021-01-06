package com.onlinecourse.io;

import java.io.*;

public class LineNumberReaderDemo {

    public static void main(String[] args) throws FileNotFoundException {
        readToString("Test/myFile.txt");
    }



    public static void readToString(String fileToRead) throws FileNotFoundException {
        String workingDir=System.getProperty("user.dir");
        File file=new File(workingDir+File.separator+fileToRead);
        System.out.println(file); //print out the file path
        LineNumberReader reader=new LineNumberReader(new FileReader(file)); //define LineNumberReader Instance
        BufferedReader br=new BufferedReader(new FileReader(file));
        String s="";
        try {
            while (reader.readLine()!=null){
                int lineNumber=reader.getLineNumber();
                s=br.readLine();
                System.out.println(lineNumber+" : "+s);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }


    }
}

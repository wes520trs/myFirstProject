package com.onlinecourse.io;

import java.io.*;

public class InputStreamFileReaderDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(readToString("Test\\Cubecart-result.txt"));
    }



    public static String readToString(String fileToText) throws IOException{
        //you can read all different types of date from all different types of sources.
        //define a stringbuilder to accumulate file content
        StringBuilder contents=new StringBuilder();
        String workingDir=System.getProperty("user.dir");
        //define file object variable
        File filePath=new File(workingDir+File.separator);
        System.out.println(filePath);
        Reader reader=null;

        try {
            InputStream inputStream=new FileInputStream(filePath+File.separator+fileToText);
            reader=new InputStreamReader(inputStream);

            int data=reader.read();
            while (data!=-1){
                char theChar=(char)data;
                data=reader.read();
                contents.append(theChar);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File can not found.");
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
        return contents.toString();

    }
}

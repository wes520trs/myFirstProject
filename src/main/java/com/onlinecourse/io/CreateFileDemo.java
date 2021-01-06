package com.onlinecourse.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFileDemo {

    //run file
    public static void main(String[] args) {
        createFile("Test result","selenium",".txt");
    }

    //create a new file with time stamp
    public static void createFile(String folder, String fileName, String fileExtention){
        //get current project path
        String filePath=System.getProperty("user.dir");
        //get current datetime stamp
        String pattern="yyyy-MM-dd-hh-mm-ss";
//        String pattern="-yyyy-MM-dd";
        SimpleDateFormat format=new SimpleDateFormat(pattern);
        Date currentDate=new Date();
        String timeStamp=format.format(currentDate).replace("-","_");
        System.out.println(timeStamp);

        //create a new file object instance
        File file=new File(folder+File.separator+fileName+timeStamp+fileExtention);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File is created.");
            System.out.println("File name is: "+file);
        }else {
            System.out.println("File is already exist.");
        }


    }

}

package com.onlinecourse.io;

import java.io.File;
import java.io.IOException;

public class RenameFileDemo {

    public static void main(String[] args) {
        createFileRenameExisting("test_result\\testfile001.txt");
    }


    //create a new file, copy it and create another backup file
    public static void createFileRenameExisting(String fileName) {
        // get current project path
        String projectPath=System.getProperty("user.dir");
        //create a new file
        File newFile=new File(projectPath+File.separator+fileName);
        try {
            if (!newFile.exists()){
                newFile.createNewFile();
                System.out.println("File is created.");
            }else {
                //get the new file path
                String absolutePath=newFile.getAbsolutePath();
                System.out.println(absolutePath);
                String filePath=absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
                System.out.println(filePath);
                File backUpFile=new File(filePath+File.separator+"backup_"+newFile.getName());
                System.out.println("Backup file name is:" +backUpFile.getName());
                System.out.println("File already exist and backup file is created.");
                newFile.renameTo(backUpFile);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

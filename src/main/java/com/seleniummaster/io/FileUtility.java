package com.seleniummaster.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    // create a method to write a text file
    public void writeToFile(String fileFolder, String fileName, String extension, String fileContent) throws IOException {
        // create a folder if the folder does not exist
        String workingDirectory=System.getProperty("user.dir");
        String finalDirectory=workingDirectory+ File.separator+fileFolder;
        // if the folder does not exist, we need to create the folder
        File file=new File(finalDirectory);
        if (!file.exists()) {
            file.mkdir();
            System.out.println("Folder is created");
        }
            //final file name
            String finalFileName = finalDirectory + File.separator + fileName + extension;
            File myFile = new File(finalFileName);
            FileWriter writer = new FileWriter(myFile.getAbsoluteFile());

            // create a buffer instance
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

//        bufferedWriter.write(fileContent);
//        bufferedWriter.close();

            try {
                bufferedWriter.write(fileContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
//        }else {
//            System.out.println("The file already exist, you can not overwrite.");
    }
}

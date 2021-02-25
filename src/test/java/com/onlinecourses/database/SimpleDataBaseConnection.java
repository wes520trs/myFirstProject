package com.onlinecourses.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleDataBaseConnection {
    public static void main(String[] args) {
        try {
            //1.get connection to the data base
            Connection myConn = DriverManager.getConnection("jdbc:mysql://148.72.106.125:3306/i4296639_cc1",
                    "testautomation", "automation123!");
            //2.create statement
            Statement myStmt = myConn.createStatement();
            //3.execute mysql query
            ResultSet myRs = myStmt.executeQuery("select * from cc_CubeCart_inventory where price>200");
            //4.process the result set
            while (myRs.next()) {
                System.out.println(myRs.getInt("product_id") + ", " + myRs.getString("name")+", "+
                        myRs.getInt("price"));
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}

package com.onlinecourses.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class PreparedStatement {

    public static void main(String[] args) {

        Connection myConn=null;
        java.sql.PreparedStatement myPreStmt=null;
        ResultSet myRs=null;

        try {
            //1.get a connection to database
            myConn= DriverManager.getConnection("jdbc:mysql://148.72.106.125:3306/i4296639_cc1",
                    "testautomation", "automation123!");
            //2.prepare statement
            myPreStmt=myConn.prepareStatement("select * from cc_CubeCart_inventory where price>? and name like ?");
            //3.set the parametres
            myPreStmt.setInt(1,200);
            myPreStmt.setString(2,"BMW%");
            //4.execute sql query
            myRs=myPreStmt.executeQuery();
            //5.display the result set
            while (myRs.next()){
                System.out.println(myRs.getInt("product_id") + ", " + myRs.getString("name")+", "+
                        myRs.getInt("price"));
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}

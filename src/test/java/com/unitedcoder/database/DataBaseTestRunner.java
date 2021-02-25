package com.unitedcoder.database;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;


public class DataBaseTestRunner {

    static String dbURL = "148.72.106.125";
    static String dbPort = "3306";
    static String userName = "testautomation";
    static String password = "automation123!";
    static String defaultSchema = "i4296639_cc1";
    Connection connection = null;

    @BeforeClass
    public void setup() throws SQLException, ClassNotFoundException {
        connection = ConnectionManager.connectToDataBaseServer(dbURL, dbPort, userName, password,
                defaultSchema, ConnectionType.MYSQLSERVER);
    }

    @Test(description = "CubeCart inventory table should have expected product")
    public void verifyProducts() throws SQLException {
        DataAccess access = new DataAccess();
        boolean isProductFound = access.getProductName("Book", connection);
        Assert.assertTrue(isProductFound);
    }

    @Test(description = "Customer table should have expected customer")
    public void verifyCustomer() throws SQLException {
        DataAccess access = new DataAccess();
        boolean isCustomerFound = access.getCustomerEmail("123@gmail.com", connection);
        Assert.assertTrue(isCustomerFound);
    }

    @Test(description = "Admin user should be able to insert record to the category table")
    public void insertCategory() throws SQLException {
        CategoryObject categoryObject = new CategoryObject("tursun1", "javaCode",
                2233, 12, 3, 1, 1, "title",
                "desc", "keyword");
        DataAccess access = new DataAccess();
        boolean isRecordInserted = access.insertNewCategory(categoryObject, connection);
        Assert.assertTrue(isRecordInserted);
    }

    @AfterClass
    public void closeConnection() throws SQLException {
        ConnectionManager.closeDataBaseConnection(connection);
    }
}

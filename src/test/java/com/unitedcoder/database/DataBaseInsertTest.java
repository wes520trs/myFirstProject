package com.unitedcoder.database;

import com.seleniummaster.configutility.ApplicationConfig;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;


public class DataBaseInsertTest {

    static String configFile="config.properties";
    static String standAloneURL= ApplicationConfig.readConfigProperties(configFile,"standAlone.dbURL");
    static String dbPort=ApplicationConfig.readConfigProperties(configFile,"standAlone.dbPort");
    static String userName=ApplicationConfig.readConfigProperties(configFile,"standAlone.userName");
    static String password=ApplicationConfig.readConfigProperties(configFile,"standAlone.password");
    static String defaultSchema=ApplicationConfig.readConfigProperties(configFile,"standAlone.defaultSchema");
    Connection connection=null;

    @BeforeClass
    public void setup() throws SQLException, ClassNotFoundException {
        connection = ConnectionManager.connectToDataBaseServer(standAloneURL, dbPort, userName, password,
                defaultSchema, ConnectionType.MYSQLSERVER);
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

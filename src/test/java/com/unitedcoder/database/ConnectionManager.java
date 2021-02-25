package com.unitedcoder.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    // the method for connecting to data base
    public static Connection connectToDataBaseServer(String dbURL, String dbPort, String dbUserName,
                                                     String dbPassword, String dbSchema,
                                                     ConnectionType connectionType)
                                                    throws ClassNotFoundException, SQLException {

        Connection connection=null;
        String JTDS_Driver="net.sourceforge.jtds.jdbc.Driver"; //SQL
        String MYSQL_Driver="com.mysql.cj.jdbc.Driver"; //MySQL

        switch (connectionType){
            case MSSQLSERVER:
                Class.forName(JTDS_Driver); //Load the SQL driver to the memory
                String connectionURL="jdbc:jtds:sqlserver://"+dbURL+":databaseName="+dbSchema;
                connection= DriverManager.getConnection(connectionURL,dbUserName,dbPassword);
                break;
            case MYSQLSERVER:
                Class.forName(MYSQL_Driver); //Load the MySQL driver to the memory
                String mySQLConnection="jdbc:mysql://"+dbURL+":"+dbPort+"/"+dbSchema;
                connection=DriverManager.getConnection(mySQLConnection,dbUserName,dbPassword);
                break;
            default:
                System.out.println("You need to specify data base connection type (MSSQL or MYSQL)");
        }
        if (!connection.isClosed()){
            System.out.println("Data base connection is established.");
        }return connection;
    }

    //close connection, because we should disconnect after test
    public static void closeDataBaseConnection(Connection connection) throws SQLException {
        if (connection.isClosed()){
            System.out.println("Data base connection has been closed.");
        }else {
            connection.close();
            System.out.println("Data base closed.");
        }
    }
}

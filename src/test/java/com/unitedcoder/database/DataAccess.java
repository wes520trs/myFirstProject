package com.unitedcoder.database;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class DataAccess {

    //get product infromarion
    public boolean getProductName(String productName, Connection connection) throws SQLException {
        boolean isProductExist = false;
        Statement statement = null;
        ResultSet resultSet = null;
        CachedRowSet cachedRowSet = null;
        cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
        statement = connection.createStatement();
        String sqlStatement = String.format("select product_id, name, price from cc_CubeCart_inventory where name='%s'",
                productName);
        resultSet = statement.executeQuery(sqlStatement);
        if (resultSet == null) {
            System.out.println("No records found.");
        } else {
            cachedRowSet.populate(resultSet);
        }
        int count = 0;
        while (true) {
            if (!cachedRowSet.next()) {
                break;
            }
            int productID = cachedRowSet.getInt("product_id");
            String name = cachedRowSet.getString("name");
            double price = cachedRowSet.getDouble("price");
            System.out.printf("product_id=%d, name=%s, price=%.2f \n", productID, name, price);
            System.out.println("read the cachedRowSet as: " + cachedRowSet.toString());
            count = cachedRowSet.getRow();
            System.out.println("Total row number is: " + count);
            if (count >= 1) {
                isProductExist = true;
            } else {
                isProductExist = false;
            }
        }
        return isProductExist;
    }

    //get customer info
    public boolean getCustomerEmail(String customerEmail, Connection connection) throws SQLException {
        boolean isEmailExist = false;
        Statement statement = null;
        ResultSet resultSet = null;
        CachedRowSet cachedRowSet = null;
        cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
        System.out.println("first cachedRowSet is: " + cachedRowSet.toCollection());
        statement = connection.createStatement();
        String sqlStatement = String.format("select customer_id, email from cc_CubeCart_customer where email='%s'",
                customerEmail);
        resultSet = statement.executeQuery(sqlStatement);
        if (resultSet == null) {
            System.out.println("No records found.");
        } else {
            cachedRowSet.populate(resultSet);
        }
        int count = 0;
        while (true) {
            if (!cachedRowSet.next()) {
                break;
            }
            int customerID = cachedRowSet.getInt("customer_id");
            String email = cachedRowSet.getString("email");
            System.out.printf("customer_id=%d, email=%s \n", customerID, email);
            System.out.println("read the cachedRowSet as: " + cachedRowSet.toString());
            count = cachedRowSet.getRow();
            System.out.println("Total row number is: " + count);
            if (count >= 1) {
                isEmailExist = true;
            } else {
                isEmailExist = false;
            }
        }
        return isEmailExist;
    }

    //insert new category
    public boolean insertNewCategory(CategoryObject categoryObject, Connection connection) throws SQLException {
        String insertQuery = "insert into cc_CubeCart_category " +
                "(cat_name, cat_desc, cat_parent_id, cat_image, per_ship, " +
                "seo_meta_title, seo_meta_description, seo_meta_keywords, priority, status) " +
                "values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement insertStatement = null;
        insertStatement = connection.prepareStatement(insertQuery);
        insertStatement.setString(1, categoryObject.getCat_name());
        insertStatement.setString(2, categoryObject.getCat_desc());
        insertStatement.setInt(3, categoryObject.getCat_parent_id());
        insertStatement.setInt(4, categoryObject.getCat_image());
        insertStatement.setInt(5, categoryObject.getPer_ship());
        insertStatement.setString(6, categoryObject.getSeoMetaTitle());
        insertStatement.setString(7, categoryObject.getCat_desc());
        insertStatement.setString(8, categoryObject.getSeoMetaKeyword());
        insertStatement.setInt(9, categoryObject.getPriority());
        insertStatement.setInt(10, categoryObject.getStatus());

        int affectiveRow = insertStatement.executeUpdate();
        if (affectiveRow > 0) {
            return true;
        } else
            return false;
    }


}

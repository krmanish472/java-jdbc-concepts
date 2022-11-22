package com.techxtor;

import java.sql.*;

/**
 * 1. import package
 * 2. load and register the driver
 * 3. create connection
 * 4. create statement
 * 5. execute query
 * 6. process result
 * 7. close connection
 */
public class SelectOne {
    public static void main(String[] args) throws SQLException {

        String query = "select userName from student where userId=102";

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12579766", "sql12579766", "Rc7Zxuaesp");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(query);

        resultSet.next();
        String name = resultSet.getString("userName");
        System.out.println(name);

        statement.close();
        connection.close();
    }
}

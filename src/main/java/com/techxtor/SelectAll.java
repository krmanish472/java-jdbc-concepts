package com.techxtor;

import java.sql.*;

public class SelectAll {
    public static void main(String[] args) throws SQLException {
        String query = "select * from student";

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12579766", "sql12579766", "Rc7Zxuaesp");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            System.out.println("UserId : " + resultSet.getInt(1)
                    + " UserName : " + resultSet.getString(2));
        }

        statement.close();
        connection.close();

    }
}

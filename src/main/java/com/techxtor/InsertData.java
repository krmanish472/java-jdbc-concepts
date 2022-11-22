package com.techxtor;

import java.sql.*;

public class InsertData {
    public static void main(String[] args) throws SQLException {
        String query = "insert into student values (104, 'Mohini')";

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12579766", "sql12579766", "Rc7Zxuaesp");

        Statement statement = connection.createStatement();

        int rowsAffected = statement.executeUpdate(query);
        System.out.println(rowsAffected + " row(s) affected");

        statement.close();
        connection.close();
    }
}

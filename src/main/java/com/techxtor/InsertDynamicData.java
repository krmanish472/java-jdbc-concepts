package com.techxtor;

import java.sql.*;

public class InsertDynamicData {
    public static void main(String[] args) throws SQLException {
        String query = "insert into student values (?,?)";

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12579766", "sql12579766", "Rc7Zxuaesp");

        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, 105);
        statement.setString(2, "Raghav");
        int count = statement.executeUpdate();
        System.out.println(count + " row(s) affected");

        statement.close();
        connection.close();
    }
}

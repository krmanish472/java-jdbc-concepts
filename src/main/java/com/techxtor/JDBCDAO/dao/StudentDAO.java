package com.techxtor.JDBCDAO.dao;

import com.techxtor.JDBCDAO.model.Student;

import java.sql.*;

public class StudentDAO {
    Connection connection = null;

    public void connect() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12579766",
                    "sql12579766",
                    "Rc7Zxuaesp");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public Student getStudent(int id) {
        try {
            Student student = new Student();
            student.setUserId(id);
            student.setUserName(getStudentUserName(id));
            return student;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    // get userName from DB
    public String getStudentUserName(int id) throws SQLException {
        Statement st = connection.createStatement();
        String query = "select userName from student where userId = " + id;
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs.getString("userName");
    }

    // add student to DB
    public void addStudent(Student s3) throws SQLException {
        String query = "insert into student values (?,?)";
        PreparedStatement pSt = connection.prepareStatement(query);
        pSt.setInt(1, s3.getUserId());
        pSt.setString(2, s3.getUserName());
        pSt.executeUpdate();
    }
}

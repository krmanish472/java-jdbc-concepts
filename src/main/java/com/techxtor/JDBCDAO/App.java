package com.techxtor.JDBCDAO;

import com.techxtor.JDBCDAO.dao.StudentDAO;
import com.techxtor.JDBCDAO.model.Student;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        // setup connection
        StudentDAO studentDao = new StudentDAO();
        studentDao.connect();

        // fetch student with id -> 103
        Student student1 = studentDao.getStudent(103);
        System.out.println(student1);

        // fetch student with id -> 1
        Student student2 = studentDao.getStudent(101);
        System.out.println(student2);

        // add new student to db
        Student student3 = new Student();
        student3.setUserId(106);
        student3.setUserName("Rahul");

        studentDao.addStudent(student3);
    }
}
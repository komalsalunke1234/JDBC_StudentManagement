package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

    public static Connection createC() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Load driver

            String url = "jdbc:mysql://localhost:3306/student_manage";  // DB URL
            String user = "root";       // your DB username
            String password = "#Komal1234";  // your DB password

            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

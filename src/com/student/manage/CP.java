package com.student.manage;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class CP {

    static Connection con;

    public static Connection createC() {
        try {
            // load the driver
            Class.forName("com.mysql.jdbc.Driver");

            // create connection
            String user = "root";
            String password = "#Komal1234";
            String url = "jdbc:mysql://localhost:/student_manage";
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }
}

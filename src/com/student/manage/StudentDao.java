package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

    public static boolean insertStudentToDB(Student st) {
        boolean f = false;
        String q = "INSERT INTO students (sname, sphone, scity) VALUES (?, ?, ?)";

        try (Connection con = CP.createC();
             PreparedStatement pstmt = con.prepareStatement(q)) {

            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());

            int rows = pstmt.executeUpdate();
            if (rows > 0) f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userId) {
        boolean f = false;
        String q = "DELETE FROM students WHERE sid = ?";

        try (Connection con = CP.createC();
             PreparedStatement pstmt = con.prepareStatement(q)) {

            pstmt.setInt(1, userId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static void showAllstudent() {
        String q = "SELECT * FROM students";

        try (Connection con = CP.createC();
             Statement stmt = con.createStatement();
             ResultSet set = stmt.executeQuery(q)) {

            while (set.next()) {
                int id = set.getInt("sid");
                String name = set.getString("sname");
                String phone = set.getString("sphone");
                String city = set.getString("scity");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Phone: " + phone);
                System.out.println("City: " + city);
                System.out.println("---------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean updateAllstudent(int id, String name, String phone, String city) {
        boolean f = false;
        String q = "UPDATE students SET sname = ?, sphone = ?, scity = ? WHERE sid = ?";

        try (Connection con = CP.createC();
             PreparedStatement pstmt = con.prepareStatement(q)) {

            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, city);
            pstmt.setInt(4, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}

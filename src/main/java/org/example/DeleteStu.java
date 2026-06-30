package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteStu {
    public static void deleteStudent() throws Exception {
        int id;
        Scanner sc = new Scanner(System.in);


        Connection con = DBConnection.getConnection();

        System.out.println("Enter Id : ");
        id= sc.nextInt();

        PreparedStatement ps = con.prepareStatement("delete from Student where id=?");
        ps.setInt(1, id);

        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("Student Deleted Successfully!");
            FileHandler.writeLog("Student Deleted : Id="+id);
        } else {
            System.out.println("Deletion fail");
        }
        con.close();
    }
}



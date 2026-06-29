package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadStu {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "aayushi123");

        PreparedStatement ps = con.prepareStatement("Select * from Student");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("Id :        "+rs.getString("id"));
            System.out.println("Name :      "+rs.getString("name"));
            System.out.println("Roll no :   "+rs.getString("rollno"));
            System.out.println("Email :     "+rs.getString("email"));
            System.out.println("Phone no :  "+rs.getString("phoneno"));
            System.out.println("Gender  :   "+rs.getString("gender"));
            System.out.println();
        }

    }
}

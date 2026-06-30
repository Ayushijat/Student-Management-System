package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchStu {
    public static void searchStu() throws Exception {
        Connection con = DBConnection.getConnection();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id");
        int id = sc.nextInt();

        String query = "Select * from student where id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            System.out.println("Id :        "+rs.getString("id"));
            System.out.println("Name :      "+rs.getString("name"));
            System.out.println("Roll no :   "+rs.getString("rollno"));
            System.out.println("Email :     "+rs.getString("email"));
            System.out.println("Phone no :  "+rs.getString("phoneno"));
            System.out.println("Gender  :   "+rs.getString("gender"));

        }else{
            System.out.println("Student Not Found!.....");
        }
        con.close();
    }
}

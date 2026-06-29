package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStu {
    public static void main(String[] args) throws Exception {
        int id = 1;
        int phoneno = 78000008;

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "aayushi123");

        PreparedStatement ps = con.prepareStatement("update Student set phoneno=? where id=?");
        ps.setString(1, String.valueOf(phoneno));
        ps.setString(2, String.valueOf(id));

        int i = ps.executeUpdate();
        if(i>0){
            System.out.println("Update Success");
        }else{
            System.out.println("Update fail");
        }
        con.close();
    }
}

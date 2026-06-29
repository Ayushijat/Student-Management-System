package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateStu {
    public static void main(String[] args) throws Exception {
        int id = 5;
        String name = "Divyanshi Jat";
        int rollno = 10245;
        String email = "diya@gmail.com";
        int phoneno = 23906585;
        String gender = "female";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","aayushi123");

        PreparedStatement ps = con.prepareStatement("insert into Student values(?,?,?,?,?,?)");
        ps.setString(1, String.valueOf(id));
        ps.setString(2,name);
        ps.setString(3, String.valueOf(rollno));
        ps.setString(4,email);
        ps.setString(5, String.valueOf(phoneno));
        ps.setString(6,gender);

        int i=ps.executeUpdate();
        if(i>0){
            System.out.println("Success");
        }else{
            System.out.println("fail");
        }
        con.close();


    }
}

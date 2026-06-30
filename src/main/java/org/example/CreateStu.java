package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CreateStu {
    public static void createStudent() throws Exception {
        int id;
        String name;
        int rollno;
        String email;
        int phoneno;
        String gender;
        Scanner sc = new Scanner(System.in);

        Connection con = DBConnection.getConnection();

        System.out.println("Enter id : ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your name : ");
        name = sc.nextLine();

        System.out.println("Enter Roll No : ");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your Email : ");
        email=sc.nextLine();

        System.out.println("Phone No : ");
        phoneno = sc.nextInt();
        sc.nextLine();

        System.out.println("Gender  : ");
        gender= sc.nextLine();

        PreparedStatement ps = con.prepareStatement("insert into Student values(?,?,?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2,name);
        ps.setInt(3,rollno);
        ps.setString(4,email);
        ps.setInt(5, phoneno);
        ps.setString(6,gender);

        int i=ps.executeUpdate();
        if(i>0){
            System.out.println("Student Added Successfully!...");

            FileHandler.writeLog("Student Added: Id = "+id+" , Name = "+name);
        }else{
            System.out.println("fail");
        }
        con.close();


    }
}

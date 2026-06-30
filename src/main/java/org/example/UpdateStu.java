package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateStu {
    public static void updateStudent() throws Exception {
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

        System.out.println("Enter new name : ");
        name = sc.nextLine();

        System.out.println("Enter new Roll No : ");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter new Email : ");
        email=sc.nextLine();

        System.out.println("new Phone No : ");
        phoneno = sc.nextInt();
        sc.nextLine();

        System.out.println("Gender  : ");
        gender= sc.nextLine();

        PreparedStatement ps = con.prepareStatement("update Student set name=?,rollno=?,email=?,phoneno=?,gender=? where id=?");
        ps.setString(1,name);
        ps.setInt(2,rollno);
        ps.setString(3,email);
        ps.setInt(4, phoneno);
        ps.setString(5,gender);
        ps.setInt(6, id);

        int i = ps.executeUpdate();
        if(i>0){
            System.out.println("Student Updated Successfully");
            FileHandler.writeLog("Student Updated : Id = "+id+" , Name = "+name);
        }else{
            System.out.println("Updation fail");
        }
        con.close();
    }
}

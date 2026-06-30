package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=========Student Management System==========");
            System.out.println("1. Create Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. delete Student");
            System.out.println("5. Search Student");

            System.out.println("6. Exit Student");
            System.out.println("Enter you choice");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    CreateStu.createStudent();
                    break;
                case 2:
                    ReadStu.readStudent();
                    break;
                case 3:
                    UpdateStu.updateStudent();
                    break;
                case 4:
                    DeleteStu.deleteStudent();
                    break;

                case 5:
                    SearchStu.searchStu();
                    break;

                case 6:
                    System.out.println("Existing .....");

                default:
                    System.out.println("Invalid choice");

            }


        }while(choice != 6);



    }
}
package com.collection_frameworks.map.tree_map;

import java.util.Scanner;

public class TakeStudentInput {
    Scanner scanner = new Scanner(System.in);
    public Student takeStudentInput(Scanner scanner){
        Student student = new Student();

        System.out.println("Enter student id : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter student name : ");
        String name = scanner.nextLine();

        System.out.println("Enter roll no : ");
        String rollNo = scanner.nextLine();

        System.out.println("Enter email id : ");
        String email = scanner.nextLine();

        System.out.println("Enter address : ");
        String address = scanner.nextLine();

        System.out.println("Enter the pin code : ");
        int pinCode = scanner.nextInt();
        scanner.nextLine();


        student.setStudentId(id);
        student.setStudentName(name);
        student.setAddress(address);
        student.setEmailId(email);
        student.setPinCode(pinCode);
        student.setRollNo(rollNo);


        return student;
    }
}

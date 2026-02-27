package com.collection_frameworks.map.tree_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TakeStudentInput studentInput = new TakeStudentInput();
        Map<Integer, Student> map = new TreeMap<>();

        System.out.println("Enter how many students you want : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter student information of : " + (i+1));
            Student student = studentInput.takeStudentInput(scanner);

            // important step
            map.put(student.getStudentId(),student);
        }


        // printing all the values
        for (Map.Entry<Integer,Student> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println("----------------------------");
        }
    }
}

package com.pojo_class;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("A",1,"1234567890","captain");
        students[1] = new Student("B",1,"1234567890","hulk");
        students[2] = new Student("C",1,"1234567890","tony");
        students[3] = new Student("D",1,"1234567890","thor");
        students[4] = new Student("E",1,"1234567890","war machine");

        printStudents(students);

        System.out.println(students[0].equals(students[1]));
        System.out.println(students[0].hashCode());
    }

    public static void printStudents(Student[] student){
        for (Student value : student) {
            System.out.println(value.toString());
            System.out.println("----------------------------");
        }
    }
}

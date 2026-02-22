package com.constructors_advanced.reference_to_instance_variable_1;



public class Student {
    String name;
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student(21,"tony");
        System.out.println(student.age + " " + student.name);
    }
}

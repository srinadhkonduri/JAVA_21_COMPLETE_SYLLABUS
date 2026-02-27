package com.collection_frameworks.set.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class SetDemo {
    static Student student = new Student();
    public static void main(String[] args) {
        Set<Student> integerSet = new HashSet<>();

        Student student1 = new Student("uppal",1,"tony");
        Student student2 = new Student("uppal",2,"stark");
        Student student3 = new Student("hyd",1,"captain");

        integerSet.add(student1);
        integerSet.add(student2);
        integerSet.add(student3);

        System.out.println(integerSet.size());
        System.out.println(integerSet.size());
    }
}

package com.collection_frameworks.set.set_project;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Course c1 = new Course(101, "Data Structures", 4);
        Course c2 = new Course(102, "Operating Systems", 3);
        Course c3 = new Course(103, "Database Systems", 4);
        Course c4 = new Course(101, "Data Structures", 4); // Duplicate ID

        // 1️⃣ HashSet
        Set<Course> hashSet = new HashSet<>();
        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);
        hashSet.add(c4);

        System.out.println("HashSet (No order):");
        hashSet.forEach(System.out::println);

        // 2️⃣ LinkedHashSet
        Set<Course> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(c1);
        linkedHashSet.add(c2);
        linkedHashSet.add(c3);
        linkedHashSet.add(c4);

        System.out.println("\nLinkedHashSet (Insertion order):");
        linkedHashSet.forEach(System.out::println);

        // 3️⃣ TreeSet
        Set<Course> treeSet = new TreeSet<>();
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);
        treeSet.add(c4);

        System.out.println("\nTreeSet (Sorted by course name):");
        treeSet.forEach(System.out::println);
    }
}

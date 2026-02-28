package com.methods.predicate;

import com.methods.predicate.Employee;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Employee employee1  = new Employee("male",   1,  "Arjun",      52000);
        Employee employee2  = new Employee("female", 2,  "Ananya",     61000);
        Employee employee3  = new Employee("male",   3,  "Rohit",      48000);
        Employee employee4  = new Employee("female", 4,  "Sneha",      75000);
        Employee employee5  = new Employee("male",   5,  "Vikram",     68000);
        Employee employee6  = new Employee("female", 6,  "Priya",      54000);
        Employee employee7  = new Employee("male",   7,  "Karthik",    72000);
        Employee employee8  = new Employee("female", 8,  "Meera",      59000);
        Employee employee9  = new Employee("male",   9,  "Aditya",     83000);
        Employee employee10 = new Employee("female", 10, "Ishita",     47000);
        Employee employee11 = new Employee("male",   11, "Nikhil",     91000);
        Employee employee12 = new Employee("female", 12, "Divya",      66000);
        Employee employee13 = new Employee("male",   13, "Rahul",      55000);
        Employee employee14 = new Employee("female", 14, "Pooja",      78000);
        Employee employee15 = new Employee("male",   15, "Siddharth",  64000);
        Employee employee16 = new Employee("female", 16, "Kavya",      82000);
        Employee employee17 = new Employee("male",   17, "Manoj",      47000);
        Employee employee18 = new Employee("female", 18, "Neha",       53000);
        Employee employee19 = new Employee("male",   19, "Varun",      76000);
        Employee employee20 = new Employee("female", 20, "Ritika",     69000);


        // getting all the names individually for boys and girls
        List<Employee> employees = List.of(
                employee1, employee2, employee3, employee4, employee5,
                employee6, employee7, employee8, employee9, employee10,
                employee11, employee12, employee13, employee14, employee15,
                employee16, employee17, employee18, employee19, employee20
        );


        // using predicate to get result
        Predicate<Employee> isFemale = e -> "female".equalsIgnoreCase(e.getGender().trim());
        Predicate<Employee> isMale = e -> "male".equalsIgnoreCase(e.getGender().trim());


        // males
        for (Employee employee : employees){
            if (isMale.test(employee)){
                System.out.println(employee.getName());
            }
        }

        System.out.println("-----------------");

        // females
        for (Employee employee : employees){
            if (isFemale.test(employee)){
                System.out.println(employee.getName());
            }
        }

    }
}

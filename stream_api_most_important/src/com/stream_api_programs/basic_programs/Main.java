package com.stream_api_programs.basic_programs;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();


        // getting names of the employees joined before 2018
        List<String> strings = main.employeeList.stream().filter(e -> e.getDateOfJoining().isBefore(LocalDate.of(2018, 1, 1))).map(Employee::getName).toList();
        System.out.println(strings);

        // male and female count
        long maleCount = main.employeeList.stream().filter(e -> e.getGender() == Gender.MALE).count();
        long femaleCount = main.employeeList.stream().filter(e -> e.getGender() == Gender.FEMALE).count();

        System.out.println("male count : " + maleCount);
        System.out.println("female count : " + femaleCount);

        // max sal of employee and min sal of employee
        int maxSalary = main.employeeList.stream().mapToInt(Employee::getSalary).max().orElse(0);
        int minSalary = main.employeeList.stream().mapToInt(Employee::getSalary).min().orElse(0);
        System.out.println(maxSalary + " " + minSalary);
    }


    List<Employee> employeeList = List.of(
            new Employee(1, "Arjun", 34, 85000, Gender.MALE,
                    LocalDate.of(2018, 3, 12), Department.ENGINEERING),

            new Employee(2, "Sneha", 29, 72000, Gender.FEMALE,
                    LocalDate.of(2020, 7, 19), Department.MARKETING),

            new Employee(3, "Rahul", 41, 95000, Gender.MALE,
                    LocalDate.of(2015, 1, 10), Department.FINANCE),

            new Employee(4, "Priya", 38, 88000, Gender.FEMALE,
                    LocalDate.of(2017, 9, 5), Department.HR),

            new Employee(5, "Vikram", 27, 60000, Gender.MALE,
                    LocalDate.of(2022, 2, 1), Department.SALES),

            new Employee(6, "Ananya", 45, 120000, Gender.FEMALE,
                    LocalDate.of(2012, 11, 23), Department.ENGINEERING),

            new Employee(7, "Karthik", 31, 78000, Gender.MALE,
                    LocalDate.of(2019, 5, 17), Department.OPERATIONS),

            new Employee(8, "Meera", 36, 91000, Gender.FEMALE,
                    LocalDate.of(2016, 8, 8), Department.FINANCE),

            new Employee(9, "Aditya", 50, 150000, Gender.MALE,
                    LocalDate.of(2010, 6, 14), Department.ENGINEERING),

            new Employee(10, "Divya", 33, 83000, Gender.FEMALE,
                    LocalDate.of(2018, 12, 2), Department.MARKETING)
    );
}

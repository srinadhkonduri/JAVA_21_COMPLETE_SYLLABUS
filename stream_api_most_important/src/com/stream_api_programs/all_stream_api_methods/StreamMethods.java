package com.stream_api_programs.all_stream_api_methods;

import com.stream_api_programs.basic_programs.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {

        // printing every one names in the list
        List<String> employees = employeeList().stream().map(Employee::getName).toList();
        System.out.println(employees);

        // printing all employees names whose age is > 25
        List<String> result = employeeList().stream().filter(employee -> employee.getAge() > 25).map(Employee::getName).toList();
        System.out.println(result);

        System.out.println("-----------");
        // get distinct city
        employeeList().stream().map(Employee::getCity).distinct().forEach(System.out::println);

        System.out.println("-----------");
        // get count of employees whose salary is > 90000
        employeeList().stream().filter(employee -> employee.getSalary() > 90000).map(Employee::getName).forEach(System.out::println);

        System.out.println("-----------");
        // get first 3 employees object
        employeeList().stream().limit(3).forEach(System.out::println);

        System.out.println("--------------");
        // anyMatch() any employee under age < 18
        boolean anyMatchResult = employeeList().stream().anyMatch(employee -> employee.getAge() < 18);
        System.out.println(anyMatchResult);


        System.out.println("--------------");
        boolean allMatchResult = employeeList().stream().allMatch(employee -> employee.getAge() < 18);
        System.out.println(allMatchResult);

        System.out.println("---------------");
        boolean nullMatchResult = employeeList().stream().noneMatch(employee -> employee.getSalary() < 90000);
        System.out.println(nullMatchResult);


        // find any will return any of the value and uses method called get
        Employee employee = employeeList().stream().findAny().get();
        System.out.println(employee);


        // find first it will always return first element
        Employee employee1 = employeeList().stream().findFirst().get();
        System.out.println(employee1);

        // SORTING
        // get employee id's in sorted order
        List<Integer> integerList = employeeList().stream().map(Employee::getId).sorted().toList();
        System.out.println(integerList);

        System.out.println("-----------------");
        // sorting by salary
        employeeList().stream()
                .sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
                .forEach(System.out::println);


        System.out.println("----------");
        // employee details of max and min sal
        Employee employeeList = employeeList().stream().max((e1,e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        System.out.println(employeeList);

        System.out.println("-------------");

        Employee employeeList1 = employeeList().stream().min((e1,e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        System.out.println(employeeList1);


        // avg sal
        double avgSal = employeeList().stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(avgSal);

        // avg age
        double age = employeeList().stream().mapToDouble(Employee::getAge).average().getAsDouble();
        System.out.println(age);

        // peeking
        employeeList()
                .stream()
                .peek(System.out::println)
                .filter(employee2 -> employee2.getYearOfJoining() > 2018)
                .toList().forEach(System.out::println);


        // collectors
        List<String> stringList = employeeList().stream().filter(employee2 -> employee2.getSalary() > 50000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(stringList);


        // collect employee names and store them in a set
        Set<String> stringList1 = employeeList().stream().map(Employee::getDepartment).collect(Collectors.toSet());
        System.out.println(stringList1);

        // collect employee id's with their salaries
        Map<Integer, Double> stringMap = employeeList().stream().collect(Collectors.toMap(Employee::getId,Employee::getSalary));
        System.out.println(stringMap);

        // group by get avg sal of each department
        Map<String, Double> stringDoubleMap = employeeList().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(stringDoubleMap);


        // sum int
        double totalSalary = employeeList().stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(totalSalary);
    }






    public static List<Employee> employeeList() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(28, "Hyderabad", "IT", "Male", 101, "Tony Stark", 150000, 2018));
        employees.add(new Employee(32, "Bangalore", "IT", "Female", 102, "Natasha Romanoff", 135000, 2019));
        employees.add(new Employee(45, "Mumbai", "Finance", "Male", 103, "Bruce Wayne", 250000, 2010));
        employees.add(new Employee(29, "Pune", "HR", "Female", 104, "Diana Prince", 90000, 2021));
        employees.add(new Employee(26, "Chennai", "IT", "Male", 105, "Peter Parker", 60000, 2023));
        employees.add(new Employee(39, "Delhi", "Operations", "Male", 106, "Clark Kent", 120000, 2015));
        employees.add(new Employee(31, "Hyderabad", "Marketing", "Female", 107, "Wanda Maximoff", 95000, 2020));
        employees.add(new Employee(24, "Bangalore", "IT", "Male", 108, "Steve Rogers", 45000, 2024)); // junior salary
        employees.add(new Employee(50, "Mumbai", "Management", "Male", 109, "Nick Fury", 300000, 2005)); // high salary
        employees.add(new Employee(27, "Pune", "Finance", "Female", 110, "Carol Danvers", 85000, 2022));

        return employees;
    }
}

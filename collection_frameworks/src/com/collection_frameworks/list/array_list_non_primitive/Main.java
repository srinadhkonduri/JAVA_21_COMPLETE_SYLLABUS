package com.collection_frameworks.list.array_list_non_primitive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeeInput employeeInput = new EmployeeInput();
        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Enter how many employees do you want : ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("\nEntering details of the employees " + (i+1));
            Employee employee = employeeInput.takeEmployeeInput(scanner);
            employeeList.add(employee);
        }


        // printing employee details
        for (Employee employee : employeeList){
            System.out.println(employee);
            System.out.println("----------------------");
        }

        // max salary
        double maxSalary = employeeList.getFirst().getSalary();
        for (Employee employee : employeeList) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
            System.out.println("max salary is : " + maxSalary);
        }

        // min salary
        double minSalary = employeeList.getFirst().getSalary();
        for (Employee employee : employeeList){
            if (employee.getSalary() < minSalary){
                maxSalary = employee.getSalary();
            }
            System.out.println("min salary is : " + minSalary);
        }

        int maleCount = 0;
        int femaleCount = 0;
        for (Employee employee : employeeList){
            if (employee.getGender() == 'm'){
                maleCount++;
            }
            if (employee.getGender() == 'f'){
                femaleCount++;
            }
            System.out.println("male count is : :" + maleCount);
            System.out.println("female count is : " + femaleCount);
        }


        // printing male employees information
        for (Employee employee : employeeList){
            if (employee.getGender() == 'm'){
                System.out.println(employee.toString());
            }
        }

        // printing all female employees information
        for (Employee employee : employeeList){
            if (employee.getGender() == 'f'){
                System.out.println(employee.toString());
            }
        }

        // printing avg salary of all employees
        double totalSalary = 0.0;
        for (Employee employee : employeeList){
            totalSalary += employee.getSalary();
        }
        double avgSalary = totalSalary / employeeList.size();
        System.out.println("avg salary : " + avgSalary);
    }
}

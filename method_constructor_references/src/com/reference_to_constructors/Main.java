package com.reference_to_constructors;

public class Main {
    public static void main(String[] args) {

        //                               constructor reference
        EmployeeDetails employeeDetails1 = Employee::new;
        EmployeeByID employeeByID = Employee::new;

        // functional interface method
        Employee employee = employeeDetails1.EMPLOYEE(2,"tony");

        // calling methods via employee using Employee class
        System.out.println(employee.getId() + " "  + employee.getName());

        Employee employeeByIDs = employeeByID.EMPLOYEES(10);
        System.out.println(employeeByIDs.getId() + " is the employee id");

    }
}

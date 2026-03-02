package com.method_references.reference_static_methods;

public class Main {
    public static void main(String[] args) {
        // interface name
        EmployeeValidation employeeValidation = Employee::isValid;


        Employee employee = new Employee("male",0,null,45000);
        System.out.println(employeeValidation.isValid(employee));
    }
}

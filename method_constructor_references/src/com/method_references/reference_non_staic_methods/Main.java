package com.method_references.reference_non_staic_methods;

public class Main {
    public static void main(String[] args) {
        // object name which is related to employee
       Employee check = new Employee();

       // calling interface names by using object reference name
       EmployeeValidation employeeValidation = check::isValid;
       EmployeeValidation employeeValidation1 = check::validSalary;

       Employee employee = new Employee("male",0,null,50000);
       System.out.println(employeeValidation.isValid(employee));

       Employee employee1 = new Employee("female",0,null,55000);
       System.out.println(employeeValidation1.isValid(employee1));

    }
}

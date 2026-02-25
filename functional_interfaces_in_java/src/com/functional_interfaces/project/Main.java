package com.functional_interfaces.project;

public class Main {
    public static void main(String[] args) {
        EmployeeOperations operations  = (Employee emp) -> {
            emp.setEmpId("1");
            emp.setName("tony");
            emp.setSalary(45000);
            emp.setMobileNumber(1234567890);

            return (emp.getEmpId() + " " + emp.getName() + " " +
                    emp.getSalary() + " " + emp.getMobileNumber());
        };

        Employee employee = new Employee();
        System.out.println(operations.apply(employee));
    }
}

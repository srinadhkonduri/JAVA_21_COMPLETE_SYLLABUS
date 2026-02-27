package com.collection_frameworks.list.array_list_non_primitive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeInput {


    // giving scanner is very important here to take the input
    public Employee takeEmployeeInput(Scanner scanner){
        Employee employee = new Employee();

        try {
            System.out.println("Enter the employee id : ");
            int id = scanner.nextInt();
            scanner.nextLine();

            if (id <= 0){
                throw new IllegalArgumentException("Employee ID must be positive");
            }
            employee.setEmpId(id);

            System.out.println("Enter employee name ");
            String name = scanner.nextLine();
            employee.setName(name);

            System.out.println("Enter employee salary");
            double salary = scanner.nextDouble();
            employee.setSalary(salary);
            scanner.nextLine();


            System.out.println("Enter employee age");
            byte age = scanner.nextByte();
            employee.setAge(age);
            scanner.nextLine();

            System.out.println("Enter employee gender");
            char gender = scanner.next().charAt(0);
            employee.setGender(gender);

            System.out.println("Enter dept id");
            byte deptId = scanner.nextByte();
            employee.setDeptId(deptId);
            scanner.nextLine();

            System.out.println("Enter manager name ");
            String managerName = scanner.nextLine();
            employee.setManagerName(managerName);


            System.out.println("Enter city name ");
            String cityName = scanner.nextLine();
            employee.setCity(cityName);

        } catch (InputMismatchException e){
            System.out.println("please enter a valid input");
        }

        return employee;
    }
}

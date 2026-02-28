package com.methods.function;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class functionalInterfaceDemoPrimitive {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;

        System.out.println(function.apply("tony stark"));


        Student student = new Student(1,99,"tony");
        Student student1 = new Student(2,89,"stark");
        Student student2 = new Student(3,67,"captain");
        Student student3 = new Student(4,90,"hulk");
        Student student4 = new Student(5,78,"vision");


        // storing students in the list
        List<Student> studentList = List.of(student,student1,student2,student3,student4);


        // getting marks of all the students
        Function<Student, Double> res = Student::getMarks;

        int sum2 = 0;
        for (Student val : studentList){
            sum2 += res.apply(val);
        }
        System.out.println(sum2);



        // getting avg sal of employees ******************
        int salSum = 0;
        int noOfEmployees = 0;
        Employee employee1 = new Employee("male",1,"tony",45000);
        Employee employee2 = new Employee("female",2,"captain",50000);
        Employee employee3 = new Employee("female",3,"stark",55000);
        Employee employee4 = new Employee("female",4,"hulk",65000);

        List<Employee> employeeList = List.of(employee1,employee2,employee3,employee4);

        // avg sal
        Function<Employee, Integer> result = Employee::getSalary;

        for (Employee employee : employeeList){
            noOfEmployees++;
            salSum += result.apply(employee);
        }

        System.out.println("sal sum is : " + salSum);
        System.out.println("avg sal is : " + salSum/noOfEmployees);

        // getting female count
        int femaleCount = 0;
        Function<Employee, String> femalesCount = Employee::getGender;

        for (Employee employee : employeeList){
            if (employee.getGender().equals("female")){
                femalesCount.apply(employee);
                System.out.println(employee.getName());
            }
        }

        System.out.println("no of females are : " + femaleCount);


        Predicate<Employee> employeePredicate = e -> "female".equalsIgnoreCase(e.getGender());
        System.out.println(employeePredicate.test(employee2));

    }

}

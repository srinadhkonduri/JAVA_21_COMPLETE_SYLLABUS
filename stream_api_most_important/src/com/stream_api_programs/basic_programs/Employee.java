package com.stream_api_programs.basic_programs;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;
    private Gender gender;
    private LocalDate dateOfJoining;
    private Department department;

    public Employee(int id, String name, int age, int salary,
                    Gender gender, LocalDate dateOfJoining,
                    Department department) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getSalary() { return salary; }
    public Gender getGender() { return gender; }
    public LocalDate getDateOfJoining() { return dateOfJoining; }
    public Department getDepartment() { return department; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                ", doj=" + dateOfJoining +
                ", dept=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee e)) return false;
        return id == e.id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

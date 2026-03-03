package com.stream_api_programs.all_stream_api_methods;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String city;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;

    public Employee() {}


    public Employee(int age, String city, String department, String gender, int id, String name, double salary, int yearOfJoining) {
        this.age = age;
        this.city = city;
        this.department = department;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                age == employee.age &&
                yearOfJoining == employee.yearOfJoining &&
                Double.compare(salary, employee.salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(city, employee.city) &&
                Objects.equals(gender, employee.gender) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, age, gender, department, yearOfJoining, salary);
    }
}

package com.collection_frameworks.list.array_list_non_primitive;

public class Employee {
    private int empId;
    private String name;
    private double salary;
    private byte age;
    private char gender;
    private byte deptId;
    private String managerName;
    private String city;

    public Employee() {}

    public Employee(byte age, String city, byte deptId, int empId, char gender, String managerName, String name, double salary) {
        this.age = age;
        this.city = city;
        this.deptId = deptId;
        this.empId = empId;
        this.gender = gender;
        this.managerName = managerName;
        this.name = name;
        this.salary = salary;
    }


    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public byte getDeptId() {
        return deptId;
    }

    public void setDeptId(byte deptId) {
        this.deptId = deptId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
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

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", deptId=" + deptId +
                ", managerName='" + managerName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

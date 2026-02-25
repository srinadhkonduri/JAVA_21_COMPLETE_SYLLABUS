package com.functional_interfaces.project;

public class Employee {
    private String empId;
    private String name;
    private double salary;
    private long mobileNumber;

    public Employee() {}

    public Employee(String empId, long mobileNumber, String name, double salary) {
        this.empId = empId;
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
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
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}

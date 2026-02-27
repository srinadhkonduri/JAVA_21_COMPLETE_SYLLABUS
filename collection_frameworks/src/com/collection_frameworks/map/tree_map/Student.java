package com.collection_frameworks.map.tree_map;

import java.util.Objects;

public class Student {
    private int studentId;
    private String studentName;
    private String rollNo;
    private String emailId;
    private String address;
    private int pinCode;

    public Student() {}

    public Student(String address, String emailId, int pinCode, String rollNo, int studentId, String studentName) {
        this.address = address;
        this.emailId = emailId;
        this.pinCode = pinCode;
        this.rollNo = rollNo;
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                ", studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                pinCode == student.pinCode &&
                Objects.equals(studentName, student.studentName) &&
                Objects.equals(rollNo, student.rollNo) &&
                Objects.equals(emailId, student.emailId) &&
                Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, rollNo, emailId, address, pinCode);
    }
}

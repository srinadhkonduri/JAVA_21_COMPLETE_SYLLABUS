package com.pojo_class;

public class Student {

    // by declaring the variables as private those who are creating objects
    // can never able to modify the real data of the variables they are just
    // creating references...
    private int id;
    private String name;
    private String mobileNumber;
    private String address;

    // empty constructor
    public Student(){}

    // argument constructor
    public Student(String address, int id, String mobileNumber, String name) {
        this.address = address;
        this.id = id;
        this.mobileNumber = mobileNumber;
        this.name = name;
    }


    // GETTERS AND SETTERS
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

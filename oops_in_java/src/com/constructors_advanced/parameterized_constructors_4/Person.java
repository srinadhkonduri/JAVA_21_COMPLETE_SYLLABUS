package com.constructors_advanced.parameterized_constructors_4;

public class Person {
    String name;
    int age;
    String address;


    // constructor 1
    Person(){
        this("unknown",0,"unknown");
    }


    // constructor 2
    public Person(String address, int age, String name) {
        this.address = address;
        this.age = age;
        this.name = name;
    }


    public static void main(String[] args) {
        Person person = new Person("NY",21,"tony");
        person.display(person);
    }

    public void display(Person person){
        System.out.println(name + " " + age + " " + address);
    }
}

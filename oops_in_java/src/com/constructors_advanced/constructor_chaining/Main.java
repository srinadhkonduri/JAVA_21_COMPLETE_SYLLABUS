package com.constructors_advanced.constructor_chaining;

class Parent {
    Parent(){
        System.out.println("parent constructor");
    }
}

class Child extends Parent{
    Child(){
        super();
        System.out.println("child class constructor ...");
    }
}


public class Main {
    public static void main(String[] args) {
        Child child = new Child();

    }
}

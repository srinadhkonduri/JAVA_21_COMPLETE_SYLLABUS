package com.constructors_advanced.constructor_arguments_5;

class A {
    A(A obj){
        System.out.println("object passed to constructor");
    }

    A(){
        this(new A(1));
    }

    A (int x){
        System.out.println("helper constructor :" + x);
    }
}


public class Main {
    public static void main(String[] args) {
        new A();
    }
}

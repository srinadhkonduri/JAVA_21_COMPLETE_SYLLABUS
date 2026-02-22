package com.constructors_advanced.call_to_current_class_method_2;

public class Example {

    public void show(){
        System.out.println("showing .... ");
    }

    public void display(){
        this.show();
    }


    public static void main(String[] args) {
        Example example = new Example();
        example.display();
    }
}

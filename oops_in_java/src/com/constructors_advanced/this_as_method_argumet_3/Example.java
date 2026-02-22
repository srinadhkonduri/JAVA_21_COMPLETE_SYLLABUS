package com.constructors_advanced.this_as_method_argumet_3;

public class Example {

    void Process(Example example){
        System.out.println("process logic");
    }

    void start(){
        Process(this);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.start();
    }
}

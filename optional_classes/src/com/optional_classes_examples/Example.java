package com.optional_classes_examples;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        Optional<String> optionalS = getName().describeConstable();
        if (optionalS.isPresent()){
            // should use get method
            String result = optionalS.get();
            result = result.toUpperCase();
            System.out.println(result);
        }
        else {
            System.out.println("value is not available");
        }

    }


    public static String getName(){
        return "nani";
    }
}

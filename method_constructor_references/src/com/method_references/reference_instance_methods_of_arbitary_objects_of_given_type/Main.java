package com.method_references.reference_instance_methods_of_arbitary_objects_of_given_type;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String[] values = {"tony","captain","hulk","thor","ironman","vision","antman","wasp"};
        Arrays.sort(values, String::compareToIgnoreCase);

        for (String string : values){
            System.out.println(string);
        }
    }
}

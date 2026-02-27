package com.collection_frameworks.list.array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(11);
        integers.add(111);
        integers.add(1111);
        integers.add(1111);
        integers.add(2);
        integers.add(22);
        integers.add(222);
        integers.add(2222);
        integers.add(3);
        integers.add(33);
        integers.add(333);
        integers.add(3333);
        integers.add(4);
        integers.add(44);
        integers.add(444);
        integers.add(4444);


        try {
            for (int i = 0; i < integers.size(); i++) {
                while (i <= 5){
                    System.out.println(integers.get(i));
                    i++;
                }
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // printing in reverse order
        for (int i = integers.size()-1; i >= 0; i--) {
            System.out.println(integers.get(i));
        }

        for (int i = 0; i < integers.size(); i += 2) {
            System.out.println(integers.get(i));
        }


        // iterating using while loop
        int i = 0;
        while (i <= integers.size()-1){
            System.out.println(
                    "while loop"
            );
            System.out.println(integers.get(i));
            i++;
        }


        // do while loop
        int j = 0;
        do {
            System.out.println("do while loop");
            System.out.println(integers.get(j));
            j++;
        } while (j <= integers.size()-1);
    }
}

package com.collection_frameworks.list.array_list;

import java.util.*;

public class AttendanceProject {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("WELCOME TO ATTENDANCE PROJECT");
        List<String> arrayList = new ArrayList<>();


        takingInput(arrayList);

        Collections.sort(arrayList);

        for (String integer : arrayList){
            System.out.print(integer + "  ");
        }

    }


    public static void takingInput(List<String> integers) {

        System.out.println("Enter roll numbers (Press Enter without typing to stop):");

        while (true) {

            String input = scanner.nextLine();

            // Stop condition
            if (input.trim().isEmpty()) {
                break;
            }

            try {
                integers.add(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

}

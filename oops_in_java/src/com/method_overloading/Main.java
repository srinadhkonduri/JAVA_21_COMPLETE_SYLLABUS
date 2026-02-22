package com.method_overloading;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {

    // same method arguments but different method names
    public void add(int a, int b){
        System.out.println("Addition is : " + (a + b));
    }

    public void sub(int a, int b){
        System.out.println("Subtraction is : " + (a - b));
    }

    public void mul(int a, int b){
        System.out.println("Multiplication is : " + (a * b));
    }

    public void div(int a, int b){
        if (b == 0) {
            System.out.println("Error: Division by zero not allowed.");
            return;
        }
        System.out.println("Division is : " + (a / b));
    }

    public void mod(int a, int b){
        if (b == 0) {
            System.out.println("Error: Modulo by zero not allowed.");
            return;
        }
        System.out.println("Modulo is : " + (a % b));
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator App");

        while (true) {

            try {
                System.out.println("\nEnter 1 for addition");
                System.out.println("Enter 2 for subtraction");
                System.out.println("Enter 3 for multiplication");
                System.out.println("Enter 4 for division");
                System.out.println("Enter 5 for modulo");
                System.out.println("Enter 0 to exit");

                int option = scanner.nextInt();

                if (option == 0) {
                    System.out.println("Thank you!");
                    break;
                }

                System.out.println("Enter a value:");
                int a = scanner.nextInt();

                System.out.println("Enter b value:");
                int b = scanner.nextInt();

                switch (option) {
                    case 1: calculator.add(a, b); break;
                    case 2: calculator.sub(a, b); break;
                    case 3: calculator.mul(a, b); break;
                    case 4: calculator.div(a, b); break;
                    case 5: calculator.mod(a, b); break;
                    default:
                        System.out.println("Enter correct option.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.next(); // clear wrong input
            }
        }

        scanner.close();
    }
}
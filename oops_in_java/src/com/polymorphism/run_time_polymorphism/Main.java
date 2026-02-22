package com.polymorphism.run_time_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static PaymentSelection selection = new PaymentSelection(scanner);

    public static void main(String[] args) {
        System.out.println("Welcome to the online shopping system");
        while (true){

            System.out.println("Enter 1 for amazon shopping");
            System.out.println("Enter 2 for flipkart shopping");
            System.out.println("Enter 3 for BlinkIT shopping");
            System.out.println("Enter 4 Zepto shopping");
            System.out.println("Enter 0 for exit");

            int option = scanner.nextInt();
            if (option == 0){
                System.out.println("Thank you ...");
                break;
            }
            try {

                switch (option){
                    case 1:
                        selection.amazonSelection();
                        break;
                    case 2:
                        selection.flipKartSelection();
                        break;
                    case 3:
                        selection.blinkItSelection();
                        break;
                    case 4:
                        selection.ZeptoSelection();
                        break;
                    default:
                        System.out.println("Enter correct option ...");
                }

            } catch (InputMismatchException e){
                System.out.println("Enter valid options to continue");
                scanner.nextLine(); // clear next line
            }
        }

        scanner.close();
    }
}

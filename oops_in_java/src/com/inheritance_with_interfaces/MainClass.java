package com.inheritance_with_interfaces;

import java.util.Scanner;

public class MainClass {
    static BasicCarFeatures basicCarFeatures = new BasicCarFeatures();
    static IntermediateCarFeatures intermediateCarFeatures = new IntermediateCarFeatures();
    static AdvancedCarFeatures advancedCarFeatures = new AdvancedCarFeatures();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean start = true;

        while (start) {
            System.out.println("Welcome to car show room");
            System.out.println("Enter 1 to basic car purchase :");
            System.out.println("Enter 2 to intermediate car purchase :");
            System.out.println("Enter 3 to advanced car purchase :");
            System.out.println("Enter 0 to exit : ");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    basicCarFeatures.display();
                    break;
                case 2:
                    intermediateCarFeatures.display();
                    break;
                case 3:
                    advancedCarFeatures.display();
                    break;
                case 0:
                    System.out.println("thank you ...");
                    start = false;
                    break;
                default:
                    System.out.println("Enter correct option ...");
            }
        }
    }
}

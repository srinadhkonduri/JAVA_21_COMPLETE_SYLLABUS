package com.project_bank_application;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static HDFCBank hdfcBank = new HDFCBank();
    static ICICIBank iciciBank = new ICICIBank();

    public static void main(String[] args) {

        System.out.println("Welcome to Loan Management System");

        while (true) {

            System.out.println("\nEnter 1 for HDFC Bank");
            System.out.println("Enter 2 for ICICI Bank");
            System.out.println("Enter 0 to Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // FIX: consume leftover newline

            if (option == 0) {
                System.out.println("Thank you...");
                break;
            }

            System.out.println("Enter loan type (home loan / car loan / personal loan / crop loan):");
            String loanType = scanner.nextLine().toLowerCase();

            switch (option) {

                case 1:
                    hdfcBank.bankName();
                    hdfcBank.findLoanType(loanType);
                    break;

                case 2:
                    iciciBank.bankName();
                    iciciBank.findLoanType(loanType);
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
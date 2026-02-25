package com.functional_interfaces.examples;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Loan Application System =====");

        while (true) {

            System.out.println("\nChoose Loan Type:");
            System.out.println("1. Car Loan");
            System.out.println("2. Home Loan");
            System.out.println("3. Personal Loan");
            System.out.println("4. Crop Loan");
            System.out.println("5. Exit");

            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter Loan Amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter Months: ");
            int months = scanner.nextInt();

            System.out.print("Enter Annual Interest Rate: ");
            double rate = scanner.nextDouble();

            LoanType loanType = getLoanType(option);

            double total = loanType.calculate(amount, months, rate);

            System.out.printf("Total Payable Amount: %.2f\n", total);
        }

        scanner.close();
    }

    private static LoanType getLoanType(int option) {

        return switch (option) {
            case 1 -> LoanType.CAR;
            case 2 -> LoanType.HOME;
            case 3 -> LoanType.PERSONAL;
            case 4 -> LoanType.CROP;
            default -> throw new IllegalArgumentException("Invalid Option");
        };
    }
}


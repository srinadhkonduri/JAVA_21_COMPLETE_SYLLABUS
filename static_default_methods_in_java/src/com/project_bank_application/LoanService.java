package com.project_bank_application;

import java.util.Scanner;

public class LoanService {

    static Scanner scanner = new Scanner(System.in);

    public static void loanApplication() {

        System.out.println("Enter the loan amount:");
        double amount = scanner.nextDouble();

        System.out.println("Enter the time in months:");
        int time = scanner.nextInt();

        System.out.println("Enter the annual interest rate:");
        double roi = scanner.nextDouble();

        double emi = calculateEmiValue(amount, time, roi);

        System.out.println("Monthly EMI: " + emi);
        System.out.println("Total Payable Amount: " + (emi * time));
    }

    public static double calculateEmiValue(double amount, int timeInMonths, double interest) {

        if (amount <= 0 || timeInMonths <= 0 || interest < 0) {
            throw new IllegalArgumentException("Invalid input values");
        }

        double monthlyRate = (interest / 12) / 100;

        if (monthlyRate == 0) {
            return amount / timeInMonths;
        }

        double power = Math.pow(1 + monthlyRate, timeInMonths);

        return (amount * monthlyRate * power) / (power - 1);
    }
}
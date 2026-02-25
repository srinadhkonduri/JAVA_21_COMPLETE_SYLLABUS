package com.bank_application_with_enum;

import java.util.Scanner;

public class LoanApplication {

    static double calculateEmi(double amount, int months, double annualInterest) {

        double monthlyRate = (annualInterest / 12) / 100;

        if (monthlyRate == 0)
            return amount / months;

        double power = Math.pow(1 + monthlyRate, months);

        return (amount * monthlyRate * power) / (power - 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select loan type :");
        for (LoanType type : LoanType.values()){
            System.out.println(type);
        }

        String input = scanner.nextLine().toUpperCase();


        LoanType selectedLoan = LoanType.valueOf(input);


        System.out.println("Enter amount :");
        double amount = scanner.nextDouble();


        System.out.println("Enter months :");
        int months = scanner.nextInt();

        double emi = calculateEmi(amount,months,selectedLoan.getInterestRate());

        System.out.println("Loan Type: " + selectedLoan);
        System.out.println("Interest Rate: " + selectedLoan.getInterestRate());
        System.out.println("Monthly EMI: " + emi);

        // final amount is being stored into the double variable
        double finalAMount = (amount + emi);

        System.out.println("final amount : " + Math.round(finalAMount));

    }
}

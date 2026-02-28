package com.methods.consumer;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerDemo {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter loan amount : ");
        double amount = scanner.nextDouble();

        System.out.println("Enter no of months : ");
        int noOFMonths = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Enter the ROI : ");
        double roi = scanner.nextDouble();



        Consumer<LoanInfo> loanConsumer = l -> {


            double principal = l.getAmount();
            int months = l.getMonths();
            double annualRate = l.getRoi();

            if (principal <= 0 || months <= 0) {
                System.out.println("Invalid loan data");
                return;
            }

            double monthlyRate = annualRate / (12 * 100);

            double emi;

            if (monthlyRate == 0) {
                // Special case: zero interest
                emi = principal / months;
            } else {
                double numerator = principal * monthlyRate * Math.pow(1 + monthlyRate, months);
                double denominator = Math.pow(1 + monthlyRate, months) - 1;
                emi = numerator / denominator;
            }

            System.out.println("Loan Amount: " + principal);
            System.out.println("Months: " + months);
            System.out.println("Annual ROI: " + annualRate + "%");
            System.out.println("Monthly EMI: " + String.format("%.2f", emi));
            System.out.println("total emi amount : " + (emi*months));
            double finalAmount = (emi*months) + amount;
            System.out.println("final amount to be paid : " + Math.round(finalAmount));
        };


        LoanInfo loanInfo = new LoanInfo(amount,noOFMonths,roi);
        loanConsumer.accept(loanInfo);
    }
}

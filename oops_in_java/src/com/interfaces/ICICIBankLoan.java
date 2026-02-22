package com.interfaces;

import java.util.Scanner;

public class ICICIBankLoan implements LoanAmount,LoanType,LoanROI,LoanTime{

    Scanner scanner = new Scanner(System.in);
    @Override
    public double getLoanAmount() {
        System.out.println("Enter the loan amount :");
        return scanner.nextDouble();
    }

    @Override
    public double getRoi() {
        return 7.0;
    }

    @Override
    public String getLoanType() {
        scanner.nextLine();
        System.out.println("Enter the type of the loan");
        return scanner.nextLine();
    }

    @Override
    public int getLoanTimeInYears() {
        System.out.println("Enter the loan time in years :");
        return scanner.nextInt();
    }


    public void finalAMountToBePaid(){
        double principal = getLoanAmount();
        int time = getLoanTimeInYears();
        double rate = getRoi();
        String type = getLoanType();

        double interest = (principal * rate * time) / 100;
        double total = principal + interest;

        System.out.println("Loan Type: " + type);
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount to be Paid: " + total);
    }
}

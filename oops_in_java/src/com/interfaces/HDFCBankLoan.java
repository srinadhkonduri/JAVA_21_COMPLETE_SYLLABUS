package com.interfaces;

import java.util.Scanner;

public class HDFCBankLoan implements LoanTime,LoanROI,LoanAmount,LoanType{

    Scanner scanner = new Scanner(System.in);
    @Override
    public double getLoanAmount() {
        System.out.println("Enter the loan amount :");
        return scanner.nextDouble();
    }

    @Override
    public double getRoi() {
        return 8.2;
    }

    @Override
    public int getLoanTimeInYears() {
        System.out.println("Enter the time in years :");
        return scanner.nextInt();
    }

    @Override
    public String getLoanType() {
        scanner.nextLine();
        System.out.println("Enter the loan type :");
        return scanner.nextLine();
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

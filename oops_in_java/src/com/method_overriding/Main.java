package com.method_overriding;

import java.util.Scanner;

class Loan {
    public double calculateEmi(double amount, int time, double ROI){
        return 0.0;
    }


}

interface BankLoanApplication {
    double calculateEmiValue(double amount, int time, double ROI);
}

// overriding via interfaces
class Hdfc implements BankLoanApplication {

    @Override
    public double calculateEmiValue(double amount, int timeInMonths, double annualROI) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than zero.");
        }

        if (timeInMonths <= 0) {
            throw new IllegalArgumentException("Loan tenure must be greater than zero.");
        }

        if (annualROI < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }

        // Special case: Zero interest loan
        if (annualROI == 0) {
            return amount / timeInMonths;
        }

        double monthlyRate = annualROI / (12 * 100); // Convert annual % to monthly decimal
        double power = Math.pow(1 + monthlyRate, timeInMonths);

        return (amount * monthlyRate * power) / (power - 1);
    }
}


class Union implements BankLoanApplication {

    @Override
    public  double calculateEmiValue(double amount, int timeInMonths, double annualROI) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than zero.");
        }

        if (timeInMonths <= 0) {
            throw new IllegalArgumentException("Loan tenure must be greater than zero.");
        }

        if (annualROI < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }

        // Special case: Zero interest loan
        if (annualROI == 0) {
            return amount / timeInMonths;
        }

        double monthlyRate = annualROI / (12 * 100); // Convert annual % to monthly decimal
        double power = Math.pow(1 + monthlyRate, timeInMonths);

        return (amount * monthlyRate * power) / (power - 1);
    }
}


class SBI implements BankLoanApplication {

    @Override
    public  double calculateEmiValue(double amount, int timeInMonths, double annualROI) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than zero.");
        }

        if (timeInMonths <= 0) {
            throw new IllegalArgumentException("Loan tenure must be greater than zero.");
        }

        if (annualROI < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative.");
        }

        // Special case: Zero interest loan
        if (annualROI == 0) {
            return amount / timeInMonths;
        }

        double monthlyRate = annualROI / (12 * 100); // Convert annual % to monthly decimal
        double power = Math.pow(1 + monthlyRate, timeInMonths);

        return (amount * monthlyRate * power) / (power - 1);
    }
}


// overriding via inheritance of the classes
class ICICIBank extends Loan {

    // parent method present inside it ...
}



public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to bank lona calculator :");

        while (true){
            System.out.println("Enter 1 for HDFC loan :");
            System.out.println("Enter 2 for UNION bank loan :");
            System.out.println("Enter 3 for SBI bank loan :");
            System.out.println("Enter 0 for exit : ");


            int option = scanner.nextInt();

            if (option == 0){
                System.out.println("thank you for visiting ...");
                break;
            }

            System.out.println("Enter the amount :");
            double amount = scanner.nextDouble();
            System.out.println("Enter the time in months :");
            int timeInMonths = scanner.nextInt();
            System.out.println("Enter the annual ROI :");
            double ROI = scanner.nextDouble();


            switch (option){
                case 1:
                    System.out.println(new Hdfc().calculateEmiValue(amount,timeInMonths,ROI) + amount);
                    break;
                case 2:
                    System.out.println(new Union().calculateEmiValue(amount,timeInMonths,ROI) + amount);
                    break;
                case 3:
                    System.out.println(new SBI().calculateEmiValue(amount,timeInMonths,ROI) + amount);
                    break;
                default:
                    System.out.println("Enter correct option ...");
            }
        }



        ICICIBank iciciBank = new ICICIBank();
        System.out.println(iciciBank.calculateEmi(1234,2,2));
    }
}

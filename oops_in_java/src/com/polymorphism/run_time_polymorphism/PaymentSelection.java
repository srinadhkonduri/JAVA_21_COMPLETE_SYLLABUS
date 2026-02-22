package com.polymorphism.run_time_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PaymentSelection {

    private final Scanner scanner;

    public PaymentSelection(Scanner scanner) {
        this.scanner = scanner;
    }

    public void amazonSelection() {

        Amazon amazon = new Amazon();

        while (true) {
            try {

                System.out.println("Welcome to AMAZON");
                System.out.println("Enter 1 for UPI");
                System.out.println("Enter 2 for Credit Card");
                System.out.println("Enter 3 for Debit Card");
                System.out.println("Enter 4 for Net Banking");
                System.out.println("Enter 5 for Amazon Pay");
                System.out.println("Enter 6 for COD");
                System.out.println("Enter 0 for Exit");

                int option = scanner.nextInt();

                if (option == 0) {
                    System.out.println("Thank you");
                    break;
                }

                switch (option) {

                    case 1:
                        System.out.println("Enter mobile number:");
                        long mobileNumber = scanner.nextLong();
                        amazon.makePaymentByUpi(mobileNumber);
                        break;

                    case 2:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberCredit = scanner.nextLine();
                        System.out.println("Enter PIN:");
                        int pinCredit = scanner.nextInt();
                        amazon.makePaymentByCreditCard(cardNumberCredit, pinCredit);
                        break;

                    case 3:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberDebit = scanner.nextLine();
                        System.out.println("Enter PIN:");
                        int pinDebit = scanner.nextInt();
                        amazon.makePaymentByDebitCard(cardNumberDebit, pinDebit);
                        break;

                    case 4:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter bank name:");
                        String bankName = scanner.nextLine();
                        System.out.println("Enter account number:");
                        long accountNumber = scanner.nextLong();
                        System.out.println("Enter PIN:");
                        int pinNet = scanner.nextInt();
                        amazon.makePaymentByNetBanking(bankName, accountNumber, pinNet);
                        break;

                    case 5:
                        System.out.println("Enter mobile number:");
                        long mobileAmazon = scanner.nextLong();
                        System.out.println("Enter PIN:");
                        int pinAmazon = scanner.nextInt();
                        amazon.makePaymentByAmazonPay(mobileAmazon, pinAmazon);
                        break;

                    case 6:
                        System.out.println("Enter COD amount:");
                        double cash = scanner.nextDouble();
                        amazon.makePaymentByCOD(cash);
                        break;

                    default:
                        System.out.println("Enter correct option");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input type. Please enter correct data.");
                scanner.nextLine(); // clear invalid input
            }
        }

    }


    public void flipKartSelection(){
        FlipKarts flipKarts = new FlipKarts();

        while (true){
            try {
                System.out.println("Welcome to AMAZON");
                System.out.println("Enter 1 for UPI");
                System.out.println("Enter 2 for Credit Card");
                System.out.println("Enter 3 for Debit Card");
                System.out.println("Enter 4 for Net Banking");
                System.out.println("Enter 5 for Amazon Pay");
                System.out.println("Enter 6 for COD");
                System.out.println("Enter 0 for Exit");

                int option = scanner.nextInt();

                if (option == 0) {
                    System.out.println("Thank you");
                    break;
                }

                switch (option) {

                    case 1:
                        System.out.println("Enter mobile number:");
                        long mobileNumber = scanner.nextLong();
                        flipKarts.makePaymentByUpi(mobileNumber);
                        break;

                    case 2:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberCredit = scanner.nextLine();
                        System.out.println("Enter PIN:");
                        int pinCredit = scanner.nextInt();
                        flipKarts.makePaymentByCreditCard(cardNumberCredit,pinCredit);
                        break;

                    case 3:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberDebit = scanner.nextLine();
                        System.out.println("Enter PIN:");
                        int pinDebit = scanner.nextInt();
                        flipKarts.makePaymentByDebitCard(cardNumberDebit,pinDebit);
                        break;

                    case 4:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberNet = scanner.nextLine();
                        System.out.println("Enter account number:");
                        long accountNumber = scanner.nextLong();
                        System.out.println("Enter PIN:");
                        int pinNet = scanner.nextInt();
                        flipKarts.makePaymentByNetBanking(cardNumberNet,accountNumber,pinNet);
                        break;

                    case 5:
                        System.out.println("Enter mobile number:");
                        long mobileAmazon = scanner.nextLong();
                        System.out.println("Enter PIN:");
                        int pinAmazon = scanner.nextInt();
                        flipKarts.makePaymentByAmazonPay(mobileAmazon,pinAmazon);
                        break;

                    case 6:
                        System.out.println("Enter COD amount:");
                        double cash = scanner.nextDouble();
                        flipKarts.makePaymentByCOD(cash);
                        break;

                    default:
                        System.out.println("Enter correct option");
                }


            } catch (InputMismatchException e){
                System.out.println("Invalid input type. Please enter correct data.");
                scanner.nextLine(); // clear invalid input
            }

        }

    }


    public void blinkItSelection(){

        BlinkIt blinkIt = new BlinkIt();

        while (true){
            try {
                System.out.println("Welcome to AMAZON");
                System.out.println("Enter 1 for UPI");
                System.out.println("Enter 2 for Credit Card");
                System.out.println("Enter 3 for Debit Card");
                System.out.println("Enter 4 for Net Banking");
                System.out.println("Enter 5 for Amazon Pay");
                System.out.println("Enter 6 for COD");
                System.out.println("Enter 0 for Exit");

                int option = scanner.nextInt();

                if (option == 0) {
                    System.out.println("Thank you");
                    break;
                }

                switch (option) {

                    case 1:
                        System.out.println("Enter mobile number:");
                        long mobileNumber = scanner.nextLong();
                        blinkIt.makePaymentByUpi(mobileNumber);
                        break;

                    case 2:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberCredit = scanner.nextLine();
                        System.out.println("Enter PIN:");
                        int pinCredit = scanner.nextInt();
                        blinkIt.makePaymentByCreditCard(cardNumberCredit,pinCredit);
                        break;

                    case 3:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberDebit = scanner.nextLine();
                        System.out.println("Enter PIN:");
                        int pinDebit = scanner.nextInt();
                        blinkIt.makePaymentByDebitCard(cardNumberDebit,pinDebit);
                        break;

                    case 4:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberNet = scanner.nextLine();
                        System.out.println("Enter account number:");
                        long accountNumber = scanner.nextLong();
                        System.out.println("Enter PIN:");
                        int pinNet = scanner.nextInt();
                        blinkIt.makePaymentByNetBanking(cardNumberNet,accountNumber,pinNet);
                        break;

                    case 5:
                        System.out.println("Enter mobile number:");
                        long mobileAmazon = scanner.nextLong();
                        System.out.println("Enter PIN:");
                        int pinAmazon = scanner.nextInt();
                        blinkIt.makePaymentByAmazonPay(mobileAmazon,pinAmazon);
                        break;

                    case 6:
                        System.out.println("Enter COD amount:");
                        double cash = scanner.nextDouble();
                        blinkIt.makePaymentByCOD(cash);
                        break;
                    default:
                        System.out.println("Enter correct option");
                }

            } catch (InputMismatchException e){
                System.out.println("Invalid input type. Please enter correct data.");
                scanner.nextLine(); // clear invalid input
            }

        }
    }


    public void ZeptoSelection(){
        Zepto zepto = new Zepto();

        while (true){
            try {
                System.out.println("Welcome to AMAZON");
                System.out.println("Enter 1 for UPI");
                System.out.println("Enter 2 for Credit Card");
                System.out.println("Enter 3 for Debit Card");
                System.out.println("Enter 4 for Net Banking");
                System.out.println("Enter 5 for Amazon Pay");
                System.out.println("Enter 6 for COD");
                System.out.println("Enter 0 for Exit");

                int option = scanner.nextInt();

                if (option == 0) {
                    System.out.println("Thank you");
                    break;
                }

                switch (option) {

                    case 1:
                        System.out.println("Enter mobile number:");
                        long mobileNumber = scanner.nextLong();
                        zepto.makePaymentByUpi(mobileNumber);
                        break;

                    case 2:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberCredit = scanner.nextLine();
                        System.out.println("Enter PIN:");
                        int pinCredit = scanner.nextInt();
                        zepto.makePaymentByCreditCard(cardNumberCredit,pinCredit);
                        break;

                    case 3:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberDebit = scanner.nextLine();
                        System.out.println("Enter PIN:");
                        int pinDebit = scanner.nextInt();
                        zepto.makePaymentByDebitCard(cardNumberDebit,pinDebit);
                        break;

                    case 4:
                        scanner.nextLine(); // consume leftover newline
                        System.out.println("Enter card number:");
                        String cardNumberNet = scanner.nextLine();
                        System.out.println("Enter account number:");
                        long accountNumber = scanner.nextLong();
                        System.out.println("Enter PIN:");
                        int pinNet = scanner.nextInt();
                        zepto.makePaymentByNetBanking(cardNumberNet,accountNumber,pinNet);
                        break;

                    case 5:
                        System.out.println("Enter mobile number:");
                        long mobileAmazon = scanner.nextLong();
                        System.out.println("Enter PIN:");
                        int pinAmazon = scanner.nextInt();
                        zepto.makePaymentByAmazonPay(mobileAmazon,pinAmazon);
                        break;

                    case 6:
                        System.out.println("Enter COD amount:");
                        double cash = scanner.nextDouble();
                        zepto.makePaymentByCOD(cash);
                        break;
                    default:
                        System.out.println("Enter correct option");
                }

            } catch (InputMismatchException e){
                System.out.println("Invalid input type. Please enter correct data.");
                scanner.nextLine(); // clear invalid input
            }

        }
    }
}
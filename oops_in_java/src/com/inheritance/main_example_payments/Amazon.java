package com.inheritance.main_example_payments;

import java.util.Scanner;

public class Amazon {

    String cardNumber = null;
    int month;
    int year;

    long mobileNumber;
    int upiNumber;
    Scanner scanner = new Scanner(System.in);
    DebitCard debitCard = new DebitCard();
    public void AmazonPayment(){
        System.out.println("welcome to the flipkart payment gateway :");
        System.out.println("Enter 1 to debit card :");
        System.out.println("Enter 2 to credit card :");
        System.out.println("Enter 3 for phone pe :");
        System.out.println(
                "Enter 4 for paytm :"
        );

        scanner.next();
        int options = scanner.nextInt();
        switch (options) {
            case 1:
                System.out.println("Enter the card Number :");
                cardNumber = scanner.nextLine();
                System.out.println("Enter month :");
                month = scanner.nextInt();
                System.out.println("ENter year : ");
                year = scanner.nextInt();
                debitCard.debitCardPayment(cardNumber,month,year);
                break;


            case 2:
                System.out.println("Enter card number :");
                cardNumber = scanner.nextLine();
                System.out.println("Enter month :");
                month = scanner.nextInt();
                System.out.println("Enter year :");
                year = scanner.nextInt();
                debitCard.creditCardPayment(cardNumber,month,year);
                break;


            case 3:

                System.out.println("Enter mobile number :");
                mobileNumber = scanner.nextLong();
                System.out.println("Enter upi number :");
                upiNumber = scanner.nextInt();
                debitCard.phonePePayment(mobileNumber,upiNumber);
                break;

            case 4:
                System.out.println("Enter mobile number :");
                mobileNumber = scanner.nextLong();
                System.out.println(
                        "Enter upi number :"
                );
                upiNumber =scanner.nextInt();
                debitCard.payThroughMobileOnly(mobileNumber,upiNumber);
                break;
            default:
                System.out.println("enter valid details :");
        }
    }

}

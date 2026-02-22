package com.inheritance.main_example_payments;
import com.inheritance.main_example_payments.CreditCardValidation;
import java.util.Scanner;

public class CreditCard extends PhonePe{

    CreditCardValidation cardValidation = new CreditCardValidation();

    public String creditCardPayment(String cardNumber, int month, int year){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the card Number :");
        cardNumber = scanner.nextLine();

        System.out.println("Enter the month of the card :");
        month = scanner.nextInt();
        scanner.next();

        System.out.println("ENter the year of the card : ");
        year = scanner.nextInt();

        if (cardValidation.creditCardNumberChecker(cardNumber) && cardValidation.creditCardMonthChecker(month) && cardValidation.creditCardYearChecker(year)){
            return "all details are good and proceed to the payment and payment done";
        }

        return "invalid information";
    }
}

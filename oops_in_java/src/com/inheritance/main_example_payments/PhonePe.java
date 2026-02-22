package com.inheritance.main_example_payments;

import java.util.Scanner;

public class PhonePe extends PayThroughMobile{

    PhonePeValidation validation = new PhonePeValidation();
    Scanner scanner = new Scanner(System.in);
    public String phonePePayment(long mobileNumber, int upiNumber){

        System.out.println("Enter your mobile number :");
        mobileNumber = scanner.nextLong();


        System.out.println(
                "Enter the upi pin for transfer the amount"
        );
        upiNumber = scanner.nextInt();


        String mobileConverter = String.valueOf(mobileNumber);
        String upiConverter = String.valueOf(upiNumber);

        if (validation.checkMobileNumber(mobileConverter) && validation.checkUpiNumber(upiConverter)){
            return "both number and upi are correct proceed to payment";
        }

        return "invalid details are given please check once";
    }
}

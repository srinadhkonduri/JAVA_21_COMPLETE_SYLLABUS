package com.inheritance.main_example_payments;

import java.util.Scanner;

public class PayThroughMobile {

    Scanner scanner = new Scanner(System.in);
    PhonePeValidation validation = new PhonePeValidation();

    public String payThroughMobileOnly(long mobile , int upiNumber){

        System.out.println("Enter your mobile number :");
        mobile = scanner.nextLong();


        System.out.println("Enter your upi number :");
        upiNumber = scanner.nextInt();


        String mobileConverter = String.valueOf(mobile);
        String upiConverter = String.valueOf(upiNumber);


        if (validation.checkMobileNumber(mobileConverter) && validation.checkUpiNumber(upiConverter))
        {
            return "both number and upi are correct proceed to payment ";
        }


        return "invalid information given please check once";
    }

}

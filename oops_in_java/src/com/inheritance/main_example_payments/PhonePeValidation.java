package com.inheritance.main_example_payments;

import java.util.Scanner;

public class PhonePeValidation {


    public boolean checkMobileNumber(String mobile){
        return mobile != null &&
                mobile.matches("[6-9]\\d{9}") && mobile.length() == 10;
    }


    public boolean checkUpiNumber(String upi){
        return upi != null &&
                upi.length() == 4;
    }
}

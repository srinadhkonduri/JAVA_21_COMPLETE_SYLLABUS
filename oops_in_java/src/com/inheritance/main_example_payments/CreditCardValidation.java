package com.inheritance.main_example_payments;

public class CreditCardValidation {

    // check if the card contains 16 numbers or not
    public boolean creditCardNumberChecker(String number){
        int numbersChanges = Integer.parseInt(number);

        // just checking the given numbers is integers or not
        return numbersChanges >= 0 && numbersChanges <= 9;
    }


    public boolean creditCardMonthChecker(int month){
        return month >= 1 && month < 12;
    }

    int[] array = {26,27,28,29,30,31,32,33,34,35};
    public boolean creditCardYearChecker(int year) {
        for (int j : array) {
            if (year == j) {
                return true;
            }
        }
        return false;
    }
}

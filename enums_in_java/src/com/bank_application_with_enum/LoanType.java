package com.bank_application_with_enum;

public enum LoanType {
    HOME_LOAN(8.5),
    CAR_LOAN(9.0),
    PERSONAL_LOAN(12.5),
    CROP_LOAN(7.5);

    private final double interestRate;

    // constructor
    LoanType(double interestRate) {
        this.interestRate = interestRate;
    }


    // getter
    public double getInterestRate() {
        return interestRate;
    }
}

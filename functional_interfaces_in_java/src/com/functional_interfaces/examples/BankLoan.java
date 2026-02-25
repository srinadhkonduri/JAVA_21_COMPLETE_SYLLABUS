package com.functional_interfaces.examples;

@FunctionalInterface
public interface BankLoan {
    double calculate(double amount, int months, double rateOfInterest);
}



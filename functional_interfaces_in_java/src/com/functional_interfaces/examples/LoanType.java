package com.functional_interfaces.examples;

public enum LoanType {

    CAR((LoanType::calculateEMI)),

    HOME((LoanType::calculateEMI)),

    PERSONAL((LoanType::calculateEMI)),

    CROP((LoanType::calculateEMI));



    private final BankLoan strategy;

    LoanType(BankLoan strategy) {
        this.strategy = strategy;
    }

    public double calculate(double amount, int months, double rate) {
        validate(amount, months, rate);
        return strategy.calculate(amount, months, rate);
    }


    // Common EMI logic (Reducing Balance)
    private static double calculateEMI(double amount, int months, double rate) {

        if (rate == 0)
            return amount;

        double r = rate / (12 * 100);
        double pow = Math.pow(1 + r, months);

        double emi = (amount * r * pow) / (pow - 1);

        return emi * months; // total payable
    }

    private static void validate(double amount, int months, double rate) {

        if (amount <= 0)
            throw new IllegalArgumentException("Loan amount must be positive");

        if (months <= 0)
            throw new IllegalArgumentException("Months must be > 0");

        if (rate < 0)
            throw new IllegalArgumentException("Rate cannot be negative");
    }
}

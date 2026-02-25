package com.order_management_system;

public enum PaymentMethod {
    CREDIT_CARD(2.0),
    DEBIT_CARD(1.0),
    UPI(0.0),
    NET_BANKING(1.5);

    private final double feePercentage;

    PaymentMethod(double feePercentage) {
        this.feePercentage = feePercentage;
    }

    public double calculateFee(double amount) {
        return (amount * feePercentage) / 100;
    }
}

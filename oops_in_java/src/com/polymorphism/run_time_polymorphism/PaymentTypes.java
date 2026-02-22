package com.polymorphism.run_time_polymorphism;

public interface PaymentTypes {
    void makePaymentByUpi(long mobileNumber);

    void makePaymentByCreditCard(String cardNumber, int pin);

    void makePaymentByDebitCard(String cardNumber, int pin);

    void makePaymentByNetBanking(String cardNumber, long bankAccNumber, int pin);

    void makePaymentByAmazonPay(long mobileNumber, int upiPin);

    void makePaymentByCOD(double cash);
}

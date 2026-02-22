package com.polymorphism.run_time_polymorphism;

public class BlinkIt implements PaymentTypes{
    @Override
    public void makePaymentByUpi(long mobileNumber) {
        System.out.println("payment done by :" + mobileNumber + " thank you ...");
    }

    @Override
    public void makePaymentByCreditCard(String cardNumber, int pin) {
        System.out.println("payment done by :" + cardNumber + " " + pin);
    }

    @Override
    public void makePaymentByDebitCard(String cardNumber, int pin) {
        System.out.println("payment done by :" + cardNumber  + " " + pin);
    }

    @Override
    public void makePaymentByNetBanking(String cardNumber, long bankAccNumber, int pin) {
        System.out.println("payment done by :" + cardNumber + " " + bankAccNumber + " " + pin);
    }

    @Override
    public void makePaymentByAmazonPay(long mobileNumber, int upiPin) {
        System.out.println("payment done by :" + mobileNumber + " " + upiPin);
    }

    @Override
    public void makePaymentByCOD(double cash) {
        System.out.println("payment " + cash + " received to delivery boy ...");
    }
}

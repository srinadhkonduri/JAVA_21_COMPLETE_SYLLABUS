package com.this_and_super_keywords;

class PaymentApplication {

    public String paymentType;

    public PaymentApplication() {
        System.out.println("Payment application created ...");
    }


    public PaymentApplication(String paymentType) {
        this.paymentType = paymentType;
        System.out.println(paymentType);
    }


    public void makePaymentByUPI(String upiId, double amount){
        System.out.println("making payment ..");
        System.out.println("payment to " + upiId + " of amount " + amount);
    }

}



class CardPayment extends PaymentApplication {

    public CardPayment() {
    }

    public CardPayment(String paymentType) {
        super(paymentType);
    }

    public void makePaymentByCard(String cardNumber, int month, int year){
        System.out.println("payment done by " + cardNumber + " in the month of " + month + " in the year of " + year);
    }
}



public class MainProject {

    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment();
        cardPayment.makePaymentByCard("1234567890",12,32);

    }

}

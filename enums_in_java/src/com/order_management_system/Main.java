package com.order_management_system;

public class Main {
    public static void main(String[] args) {

        OrderClass order = new OrderClass(
                10000,
                PaymentMethod.CREDIT_CARD,
                DeliveryType.EXPRESS
        );


        order.confirmOrder();
        order.shipOrder();
        order.deliverOrder();

        order.printOrderSummary();
    }
}

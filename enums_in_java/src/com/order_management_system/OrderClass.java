package com.order_management_system;

public class OrderClass {
    private double amount;
    private OrderStatus status;
    private PaymentMethod paymentMethod;
    private DeliveryType deliveryType;

    public OrderClass(double amount,
                 PaymentMethod paymentMethod,
                 DeliveryType deliveryType) {

        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.deliveryType = deliveryType;
        this.status = OrderStatus.CREATED;
    }

    public void confirmOrder() {
        if (status == OrderStatus.CREATED) {
            status = OrderStatus.CONFIRMED;
        }
    }

    public void shipOrder() {
        if (status == OrderStatus.CONFIRMED) {
            status = OrderStatus.SHIPPED;
        }
    }

    public void deliverOrder() {
        if (status == OrderStatus.SHIPPED) {
            status = OrderStatus.DELIVERED;
        }
    }

    public void cancelOrder() {
        if (status.canCancel()) {
            status = OrderStatus.CANCELLED;
        } else {
            System.out.println("Cannot cancel at this stage.");
        }
    }

    public void printOrderSummary() {

        double fee = paymentMethod.calculateFee(amount);
        double finalAmount = amount + fee;

        System.out.println("Order Status: " + status);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Delivery Type: " + deliveryType);
        System.out.println("Delivery in Days: " + deliveryType.getDeliveryDays());
        System.out.println("Original Amount: " + amount);
        System.out.println("Payment Fee: " + fee);
        System.out.println("Final Amount: " + finalAmount);
    }
}

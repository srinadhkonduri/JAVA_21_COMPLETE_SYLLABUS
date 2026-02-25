package com.order_management_system;

public enum DeliveryType {
    STANDARD(5),
    EXPRESS(2),
    SAME_DAY(1);

    private final int deliveryDays;

    DeliveryType(int deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public int getDeliveryDays() {
        return deliveryDays;
    }
}

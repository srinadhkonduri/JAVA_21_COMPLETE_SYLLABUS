package com.order_management_system;

public enum OrderStatus {

        CREATED,
        CONFIRMED,
        SHIPPED,
        DELIVERED,
        CANCELLED;

        public boolean canCancel() {
            return this == CREATED || this == CONFIRMED;
        }
}

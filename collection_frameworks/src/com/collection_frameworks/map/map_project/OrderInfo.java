package com.collection_frameworks.map.map_project;

import java.util.Objects;

public class OrderInfo {
    private int orderId;
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private String customerEmail;

    public OrderInfo() {}

    public OrderInfo(String customerAddress, String customerEmail, String customerId, String customerName, String customerPhone, int orderId) {
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.orderId = orderId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "customerAddress='" + customerAddress + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", orderId=" + orderId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderInfo orderInfo = (OrderInfo) o;
        return orderId == orderInfo.orderId &&
                Objects.equals(customerId, orderInfo.customerId) &&
                Objects.equals(customerName, orderInfo.customerName) &&
                Objects.equals(customerAddress, orderInfo.customerAddress) &&
                Objects.equals(customerPhone, orderInfo.customerPhone) &&
                Objects.equals(customerEmail, orderInfo.customerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerId, customerName, customerAddress, customerPhone, customerEmail);
    }
}

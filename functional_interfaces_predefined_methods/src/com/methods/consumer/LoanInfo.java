package com.methods.consumer;

public class LoanInfo {
    private double amount;
    private int months;
    private double roi;


    public LoanInfo() {}

    public LoanInfo(double amount, int months, double roi) {
        this.amount = amount;
        this.months = months;
        this.roi = roi;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    @Override
    public String toString() {
        return "LoanInfo{" +
                "amount=" + amount +
                ", months=" + months +
                ", roi=" + roi +
                '}';
    }
}

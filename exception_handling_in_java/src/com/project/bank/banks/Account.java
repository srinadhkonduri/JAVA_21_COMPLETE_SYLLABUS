package com.project.bank.banks;

import com.project.bank.exception.InsufficientBalanceException;
import com.project.bank.exception.InvalidAmountException;

public class Account {
    private final long accountNumber;
    private String name;
    private double balance;

    public Account(long accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount){
        if (amount <= 0){
            throw new InvalidAmountException("Deposit must be positive");
        }
        balance += amount;
    }

    public void withDraw(double amount) throws InsufficientBalanceException{
         if (amount <= 0){
             throw new InvalidAmountException("Withdraw must be positive");
         }

         if (amount > balance){
             throw new InsufficientBalanceException("Insufficient balance. Available :" + balance);
         }

         balance -= amount;
    }
}

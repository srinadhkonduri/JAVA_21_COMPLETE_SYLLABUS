package com.project.bank.bank_service;

import com.project.bank.banks.Account;
import com.project.bank.exception.AccountNotFoundException;
import com.project.bank.exception.InsufficientBalanceException;
import com.project.bank.utils.FileLogger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Service {
    private Map<Integer, Account> map = new HashMap<>();

    public void createAccount(long accNo, String name, double balance) {
        map.put((int) accNo, new Account(accNo, balance, name));
    }

    public Account getAccount(long accNo) throws AccountNotFoundException {
        Account account = map.get(accNo);
        if (account == null){
            throw new AccountNotFoundException("account not found : " + accNo);
        }
        return account;
    }

    public void deposit(long accNo, double amount) throws IOException {
        Account account = map.get(accNo);
        account.deposit(amount);
        FileLogger.log("Deposited :" + amount + " to your account");
    }


    public void withdraw(int accNo, double amount) throws IOException {
        Account account = map.get(accNo);

        account.withDraw(amount);
        FileLogger.log("withdrawed :" + amount + " from your account ");
    }
}

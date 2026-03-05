package com.program_using_synchronized_method;

public class Main{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        ATM atm1 = new ATM(bankAccount,10000);
        ATM atm2 = new ATM(bankAccount,20000);

        atm1.setName("atm-1");
        atm2.setName("atm-2");


        atm1.start();
        atm2.start();
    }
}

package com.program_using_synchronized_method;

public class BankAccount {
    private int balance = 50000;


    public synchronized void withDraw(String threadName, int amount){
        System.out.println(threadName + " trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println(threadName + " processing withdrawal...");

            try {
                Thread.sleep(2000); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance = balance - amount;
            System.out.println(threadName + " completed withdrawal");

        } else {
            System.out.println(threadName + " insufficient balance");
        }

        System.out.println("Remaining balance: " + balance);
    }
}


class ATM extends Thread {
    BankAccount account;
    int amount;


    public ATM(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withDraw(Thread.currentThread().getName(), amount);
    }
}


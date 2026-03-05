package com.synchronized_block;

class BankAccount extends Thread{

    private int balance = 1000;

    public void withdraw(String threadName, int amount) {

        System.out.println(threadName + " trying to withdraw " + amount);

        synchronized (this) {

            if (balance >= amount) {

                System.out.println(threadName + " processing withdrawal...");

                try {
                    Thread.sleep(2000);
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
}
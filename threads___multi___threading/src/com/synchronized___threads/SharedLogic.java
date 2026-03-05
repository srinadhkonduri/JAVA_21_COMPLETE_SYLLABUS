package com.synchronized___threads;

public class SharedLogic {

    public synchronized void printData(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            System.out.print(n * i + " ");
        }
    }
}

package com.synchronized___threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedLogic sharedLogic = new SharedLogic();
        FirstThread thread = new FirstThread(sharedLogic);
        FirstThread thread1 = new FirstThread(sharedLogic);

        thread.start();

        thread1.start();


    }
}

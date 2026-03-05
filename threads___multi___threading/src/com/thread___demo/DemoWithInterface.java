package com.thread___demo;

public class DemoWithInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("thread started");
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello : " + i);
        }
    }

    public static void main(String[] args) {
        DemoWithInterface demo = new DemoWithInterface();
        Thread thread = new Thread(demo);
        thread.start();
    }
}

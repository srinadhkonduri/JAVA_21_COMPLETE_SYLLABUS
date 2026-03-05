package com.thread___demo;

public class DemoWithClass extends Thread{

    @Override
    public void run(){
        // logic
        System.out.println("hello first thread started executing");
        for (int i = 0; i < 10; i++) {
            System.out.println("hi : " + i);
        }

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i
            + " ");
        }
    }


    public static void main(String[] args) {
        DemoWithClass demo = new DemoWithClass();
        demo.start();
    }
}

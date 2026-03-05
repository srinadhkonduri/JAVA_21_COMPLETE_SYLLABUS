package com.thread___demo;

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        String message = "hi welcome to the multithreading";
        char[] result = message.toCharArray();
        Runnable r1 = () -> {
            try {
                for (char c : result) {
                    Thread.sleep(50);
                    System.out.print(Thread.currentThread().getName());
                    System.out.println();
                    System.out.print(c);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread = new Thread(r1);
        thread.start();
    }
}

package com.tosan.example1;

public class Example1 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
        System.out.println("I am main thread...");
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Work number " + i + " is running");

        }
//        for (int i = 0; i < 50; i++) {
//            System.out.println("Work number " + i + " is running in the same time");
//        }
    }
}

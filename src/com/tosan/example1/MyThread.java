package com.tosan.example1;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Work number " + i + " is running in the same time");
        }
    }
}

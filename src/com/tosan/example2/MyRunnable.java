package com.tosan.example2;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Work number " + i + " is running in the same time");
        }
    }
}

package com.tosan.example4;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
//            for (int i=0;i<1000; i++){
//                System.out.println(i);
//            }
            System.out.println(Thread.currentThread().getState());
        });
        thread.start();
//        thread.wait(5000);
//        for (int i=0; i<1000; i++){
//            System.out.println("main " + i);
//        }
        System.out.println(thread.getState());
    }
}

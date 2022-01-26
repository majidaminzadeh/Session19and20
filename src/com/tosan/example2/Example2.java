package com.tosan.example2;

public class Example2 {
    public static void main(String[] args) {
//        MyRunnable runnable = new MyRunnable(); // interface implementation
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + " is running");
//                System.out.println("hey!");
//            }
//        }); // anonymous class
//        Thread thread = new Thread(() -> {
//                System.out.println(Thread.currentThread().getName() + " is running");
//                System.out.println("hey!");
//            }); // lambda expression
        Thread thread = new Thread(Example2::print); // Method reference
        thread.start();
        System.out.println("I am main thread...");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Work number " + i + " is running");

        }
//        for (int i = 0; i < 50; i++) {
//            System.out.println("Work number " + i + " is running in the same time");
//        }
    }

    public static void print(){
        System.out.println(Thread.currentThread().getName() + " is running");
        System.out.println("hey!");
    }
}

package com.tosan.example5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example5 {

    public static int index = 0;
    public static void main(String[] args) {
        //thread1 ... thread1000
//        Thread thread = new Thread(() -> System.out.println("running"), "My Thread");
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        executorService.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
//            for (int i =0 ; i< 1000; i++){
                System.out.println("Task1 is running");
//            }
        });
        executorService.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
//            for (int i =0 ; i< 1000; i++){
                System.out.println("Task2 is running");
//            }
        });
        executorService.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
//            for (int i =0 ; i< 1000; i++){
                System.out.println("Task3 is running");
//            }
        });
        executorService.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
//            for (int i =0 ; i< 1000; i++){
                System.out.println("Task4 is running");
//            }
        });
        executorService.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
//            for (int i =0 ; i< 1000; i++){
                System.out.println("Task5 is running");
//            }
        });
        executorService.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
//            for (int i =0 ; i< 1000; i++){
                System.out.println("Task6 is running");
//            }
        });
        executorService.shutdown();
    }

    // t1 call increase => 1
    // t2 call increase => 2
    // final state? => 2
    public static synchronized void increase(){
        index = index + 1;
    }


}

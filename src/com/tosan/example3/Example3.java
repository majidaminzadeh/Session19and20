package com.tosan.example3;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        Thread thread1 = new Thread(Example3::thread1);
        Thread thread2 = new Thread(Example3::thread2);
        Thread thread3 = new Thread(Example3::thread3);
        Thread thread4 = new Thread(Example3::thread4);
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        for(Thread thread : threads){
            thread.start();
        }
        thread1.start();
        for (int i = 400; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Work number " + i + " is running");
        }
    }


    public static void thread1(){
        Thread thread = new Thread(Example3::thread5);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Work number " + i + " is running");
            throw new RuntimeException();
        }
    }
    public static void thread2(){
        for (int i = 100; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Work number " + i + " is running");
        }
    }
    public static void thread3(){
        for (int i = 200; i < 300; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Work number " + i + " is running");
        }
    }
    public static void thread4(){
        for (int i = 300; i < 400; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Work number " + i + " is running");
        }
    }
    public static void thread5(){
        for (int i = 600; i < 700; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            System.out.println("Work number " + i + " is running");
        }
    }
}

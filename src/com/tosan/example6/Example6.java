package com.tosan.example6;

import com.tosan.example5.Deposit;

public class Example6 {
    // critical section
    public static void main(String[] args) {
        Deposit deposit = new Deposit();
        Deposit deposit2 = new Deposit();
        Thread thread1 = new Thread(()->{
            deposit.increaseBalance(10);
        });
        Thread thread2 = new Thread(()->{
//            deposit2.increaseBalance(20);
            deposit.increaseBalance(20);
        });
        thread1.start();
        thread2.start();
        deposit.increaseBalance(15);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(deposit.getBalance());
    }
}

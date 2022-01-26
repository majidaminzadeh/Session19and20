package com.tosan.example5;

public class Deposit {
    private /*volatile*/ Integer balance = 0;

    public /*synchronized*/ void increaseBalance(int balance){
        System.out.println(Thread.currentThread().getName() + " balance before increase " + this.balance);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this.balance) {
            System.out.println(Thread.currentThread().getName() + " I am in synch block");
            this.balance += balance;
        }
        System.out.println(Thread.currentThread().getName() + " balance after increase " + this.balance);
    }

    public int getBalance() {
        return balance;
    }
}

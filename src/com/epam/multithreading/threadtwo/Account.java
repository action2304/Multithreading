package com.epam.multithreading.threadtwo;

public class Account {

    private int balance;
    private Object lock = new Object();

    public Account(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        synchronized (lock){
            int x = balance + amount;
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = x;
        }
    }

    public void withdraw(int amount){
        synchronized(lock){
            int x = balance - amount;
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = x;
        }
    }
}

package com.epam.multithreading.startthread;

public class Account {

    private int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public synchronized void deposit(int amount){
        int x = balance + amount;
        try {
            Thread.sleep(15);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        balance = x;
    }

    public synchronized void withdraw(int amount){
        int x = balance - amount;
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = x;
    }
}

package com.epam.multithreading.startthread;

public class OperatorDeposit extends Thread {

    private Account account;

    public OperatorDeposit(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(100);
        }
    }
}

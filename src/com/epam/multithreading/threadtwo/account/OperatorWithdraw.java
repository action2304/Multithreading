package com.epam.multithreading.threadtwo.account;

public class OperatorWithdraw extends Thread {

    private Account account;

    public OperatorWithdraw(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (account){
                account.withdraw(50);
            }
        }
    }
}

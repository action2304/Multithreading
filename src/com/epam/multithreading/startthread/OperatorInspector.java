package com.epam.multithreading.startthread;

public class OperatorInspector {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(200);
        OperatorDeposit opD = new OperatorDeposit(account);
        OperatorWithdraw opW = new OperatorWithdraw(account);

        opD.start();
        opW.start();

        opD.join();
        opW.join();

        System.out.println(account.getBalance());
    }
}

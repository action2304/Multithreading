package com.epam.multithreading._volatile;

public class VolatileDemo {

    public static void main(String... args) throws InterruptedException {

        Clicker click1 = new Clicker();
        click1.start();
        Thread.sleep(50);

        click1.stopClick();
        click1.join();

        System.out.println("Последний оператор метода main");
    }
}

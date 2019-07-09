package com.epam.multithreading.startthread;

public class ThreadDemo {

    public static void main(String[] args) {
        // новые объекты потоков
        Talk talk = new Talk();
        Thread walk = new Thread(new Walk());
        // запуск потоков
        talk.start();
        walk.start();
        // Walk w = new Walk; // просто объект, не поток
        // w.run(); // выполнит метод, но поток не запуститься!
        System.out.println(talk.getState());
        System.out.println(walk.getId());
    }
}

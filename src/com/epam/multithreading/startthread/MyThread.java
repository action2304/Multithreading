//package com.epam.multithreading.startthread;
//
//public class MyThread extends Thread {
//
//    public MyThread(String threadName, ThreadGroup tg0b) {
//        super(tg0b, threadName);
//        System.out.println("New thread: " + this);
//        start();
//    }
//
//    @Override
//    public void run() {
//        try {
//            for (int i = 5; i > 0; i--) {
//                System.out.println(getName() + ": " + i);
//            }
//        }catch (Exception e){
//            System.out.println("Exception in " + getName());
//        }
//        System.out.println(getName() + " exiting");
//    }
//}

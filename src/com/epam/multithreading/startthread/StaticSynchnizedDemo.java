package com.epam.multithreading.startthread;

public class StaticSynchnizedDemo {

    public static void main(String[] args) {

        new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    try {
                        StaticSynch.a();
                        Thread.sleep(20);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        for (int i = 0; i < 5; i++) {
            try {
                StaticSynch.b();
                Thread.sleep(20);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

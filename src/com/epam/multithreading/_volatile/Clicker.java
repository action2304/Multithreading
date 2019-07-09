package com.epam.multithreading._volatile;

public class Clicker extends Thread {

    private int click = 0;
    private volatile boolean running = true;

    public Clicker(){
    }

    @Override
    public void run() {
        while(running){
            System.out.println(click);
            click++;
        }
    }

    public void stopClick(){
        running = false;
    }
}

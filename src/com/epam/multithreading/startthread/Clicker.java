package com.epam.multithreading.startthread;

public class Clicker extends Thread {

    int click = 0;
    private volatile boolean running = true;

    public Clicker() {
    }

    @Override
    public void run() {
        while (running) {
            click++;
        }
    }

    public void stopClick() {
        running = false;
    }
}

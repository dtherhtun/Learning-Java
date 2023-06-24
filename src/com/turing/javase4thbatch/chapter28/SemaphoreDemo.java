package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.Semaphore;

class Worker implements Runnable {

    private Semaphore semaphore;
    private Thread thread;
    private String name;

    public void start() {
        this.thread.start();
    }

    public Worker(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
        this.thread = new Thread(this);
    }
    @Override
    public void run() {
        try {
            System.out.println(name + " is trying to acquire a permit.");
            semaphore.acquire();
            System.out.println(name + " has acquired a permit.");
            Thread.sleep(2000); // some work
            System.out.println(name + " is releasing the permit.");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        Worker worker1 = new Worker(semaphore, "Worker 1");
        Worker worker2 = new Worker(semaphore, "Worker 2");
        Worker worker3 = new Worker(semaphore, "worker 3");

        worker1.start();
        worker2.start();
        worker3.start();
     }
}

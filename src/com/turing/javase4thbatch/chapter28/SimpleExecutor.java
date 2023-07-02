package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorThread extends Thread {
    CountDownLatch latch;
    String name;

    ExecutorThread(CountDownLatch latch, String name) {
        this.name = name;
        this.latch = latch;
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Name "+ name + " i "+ i);
            this.latch.countDown();
        }
    }
}
public class SimpleExecutor {
    public static void main(String[] args) {
        CountDownLatch cdl1 = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Starting");

        es.execute(new ExecutorThread(cdl1, "A"));
        es.execute(new ExecutorThread(cdl2, "B"));
        es.execute(new ExecutorThread(cdl3, "C"));
        es.execute(new ExecutorThread(cdl4, "D"));

        try {
            cdl1.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Done");
    }
}

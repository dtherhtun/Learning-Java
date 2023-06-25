package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.CountDownLatch;

class CDThread extends Thread {
    CountDownLatch latch;
    CDThread(CountDownLatch newLatch){
        this.latch = newLatch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            this.latch.countDown();

            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("Starting");

        CDThread t = new CDThread(cdl);
        t.start();

        try {
            System.out.println("Start Calling await");
            cdl.await();
            System.out.println("Done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

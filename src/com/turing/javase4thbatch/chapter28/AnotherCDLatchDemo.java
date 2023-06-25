package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.CountDownLatch;

public class AnotherCDLatchDemo {
    static class CDWorker implements Runnable {
        private CountDownLatch latch;
        private String name;

        public CDWorker(CountDownLatch newLatch, String newName) {
            this.latch = newLatch;
            this.name = newName;
        }

        @Override
        public void run() {
            System.out.println(name + " is doing some work.");

            // Simulating work by sleeping for a random duration
            try {
              Thread.sleep((long) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " has finished its work.");
            latch.countDown(); // Decrement the latch count
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = 5;
        CountDownLatch latch = new CountDownLatch(numberOfThreads);


        for (int i = 0; i < numberOfThreads; i++) {
            CDWorker cdWorker = new CDWorker(latch, "Thread "+(i + 1 ));
            Thread thread = new Thread(cdWorker);
            thread.start();
        }

        // Main thread waits for all threads to count down
        latch.await();

        System.out.println("All threads have finished their work.");
    }
}

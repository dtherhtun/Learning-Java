package com.turing.javase4thbatch.synchronizers;

/*
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4); // Count: 4

        Runnable task = () -> {
            // Perform some task
            System.out.println("Task executed by thread: " + Thread.currentThread().getName());
            latch.countDown();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        Thread thread4 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            latch.await(); // Wait for count to reach 0
            System.out.println("All tasks completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4); // Initialize CountDownLatch with a count of 4

        // Worker threads
        for (int i = 1; i <= 4; i++) {
            int threadNumber = i;
            new Thread(() -> {
                // Perform task
                System.out.println("Thread " + threadNumber + ": Executing task");
                latch.countDown(); // Signal that task is completed
            }).start();
        }

        latch.await(); // Wait until all tasks are completed
        System.out.println("All tasks completed. Main thread continues.");
    }
}
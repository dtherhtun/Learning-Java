package com.turing.javase4thbatch.synchronizers;
/*
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(4); // Parties: 4

        Runnable task = () -> {
            try {
                // Perform some part of the task
                System.out.println("Task executed by thread: " + Thread.currentThread().getName());
                barrier.await(); // Wait for all threads to reach the barrier
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
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
            barrier.await(); // Wait for all threads to reach the barrier
            System.out.println("All tasks completed");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

 */
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(4, () -> {
            System.out.println("All threads reached the barrier. Continuing execution.");
        }); // Initialize CyclicBarrier with a party size of 4 and a barrier action

        // Worker threads
        for (int i = 1; i <= 4; i++) {
            int threadNumber = i;
            new Thread(() -> {
                try {
                    // Perform part of the task
                    System.out.println("Thread " + threadNumber + ": Executing part of the task");
                    barrier.await(); // Wait for other threads to reach the barrier

                    // Perform remaining part of the task after synchronization
                    System.out.println("Thread " + threadNumber + ": Executing remaining part of the task");
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}


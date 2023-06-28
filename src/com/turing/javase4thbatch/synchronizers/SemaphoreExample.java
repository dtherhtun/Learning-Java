package com.turing.javase4thbatch.synchronizers;

import java.util.concurrent.Semaphore;

/*
class SemaphoreTask implements Runnable {
    Semaphore sem;

    SemaphoreTask(Semaphore semaphore) {
        this.sem = semaphore;
    }
    @Override
    public void run() {
        try {
            sem.acquire();
            // Critical section
            System.out.println("Thread acquired permit: " + Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
            System.out.println("Thread released permit: " + Thread.currentThread().getName());
        }
    }
}
 */

/*public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // Number of permits: 2
        // SemaphoreTask task = new SemaphoreTask(semaphore); // use with SemaphoreTask class

        Runnable task = () -> {
            try {
                System.out.println("Thread trying to acquire permit: " + Thread.currentThread().getName());
                semaphore.acquire();
                System.out.println("Thread acquired permit: " + Thread.currentThread().getName());
                // Critical section
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " is working on critical section");
                }
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
                System.out.println("Thread released permit: " + Thread.currentThread().getName());
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
    }
}

 */

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // Initialize Semaphore with 2 permits

        // Worker threads
        for (int i = 1; i <= 4; i++) {
            int threadNumber = i;
            new Thread(() -> {
                try {
                    System.out.println("Thread " + threadNumber + ": Attempting to acquire a permit");
                    semaphore.acquire(); // Acquire a permit from the Semaphore
                    System.out.println("Thread " + threadNumber + ": Acquired a permit");

                    // Perform critical section operations
                    System.out.println("Thread " + threadNumber + ": Executing critical section");
                    Thread.sleep(2000); // Simulating some work

                    System.out.println("Thread " + threadNumber + ": Releasing the permit");
                    semaphore.release(); // Release the permit
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

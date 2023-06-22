package com.turing.javase4thbatch.chapter11;

class Counter {
    private int count = 0;

    // Method increment() implements monitor concept
    public synchronized void increment() {
        count++;
    }

    // Method decrement() implements monitor concept
    public synchronized void decrement() {
        count--;
    }

    // Method getCount() implements monitor concept
    public synchronized int getCount() {
        return count;
    }
}

public class Monitor {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Thread 1 increments the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Thread 2 decrements the counter
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 999; i++) {
                counter.decrement();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}

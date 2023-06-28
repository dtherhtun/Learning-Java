package com.turing.javase4thbatch.synchronizers;

/*
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Runnable task = () -> {
            try {
                String data = exchanger.exchange("Thread data: " + Thread.currentThread().getName());
                System.out.println("Thread received data: " + data);
            } catch (InterruptedException e) {
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
    }
}

 */

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        // Thread1
        new Thread(() -> {
            try {
                String message = "Hello from Thread1";
                System.out.println("Thread1: Sending message - " + message);
                String receivedMessage = exchanger.exchange(message); // Exchange message with Thread2
                System.out.println("Thread1: Received message - " + receivedMessage);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Thread2
        new Thread(() -> {
            try {
                String message = "Hello from Thread2";
                System.out.println("Thread2: Sending message - " + message);
                Thread.sleep(2000); // Simulating some work
                String receivedMessage = exchanger.exchange(message); // Exchange message with Thread1
                System.out.println("Thread2: Received message - " + receivedMessage);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Thread3
        new Thread(() -> {
            try {
                String message = "Hello from Thread3";
                System.out.println("Thread3: Sending message - " + message);
                String receivedMessage = exchanger.exchange(message); // Exchange message with Thread4
                System.out.println("Thread3: Received message - " + receivedMessage);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Thread4
        new Thread(() -> {
            try {
                String message = "Hello from Thread4";
                System.out.println("Thread4: Sending message - " + message);
                Thread.sleep(2000); // Simulating some work
                String receivedMessage = exchanger.exchange(message); // Exchange message with Thread3
                System.out.println("Thread4: Received message - " + receivedMessage);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}


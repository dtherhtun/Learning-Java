package com.turing.javase4thbatch.synchronizers;

import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        // Initialize Phaser with a party size of 5
        // (including the main thread) that will participate
        // in the synchronization using the Phaser.
        Phaser phaser = new Phaser(5);
        // The number of phases does not have to match the number
        // of parties or synchronization points exactly. It depends
        // on the specific requirements of the application and how
        // the synchronization points are used. In this case, the
        // code has three distinct phases, but the party size is set
        // to 5 to demonstrate the usage of the Phaser with multiple threads.

        // Worker threads
        for (int i = 1; i <= 4; i++) {
            int threadNumber = i;
            new Thread(() -> {
                System.out.println("Thread " + threadNumber + ": Starting phase 1");
                phaser.arriveAndAwaitAdvance(); // Wait for all threads to complete phase 1

                // Perform phase 2 operations
                System.out.println("Thread " + threadNumber + ": Starting phase 2");
                phaser.arriveAndAwaitAdvance(); // Wait for all threads to complete phase 2

                // Perform phase 3 operations
                System.out.println("Thread " + threadNumber + ": Starting phase 3");
                phaser.arriveAndAwaitAdvance(); // Wait for all threads to complete phase 3

                // Deregister from the phaser
                phaser.arriveAndDeregister();
            }).start();
        }
        // Regarding the phases, the number of phases in the code is determined
        // by the number of synchronization points used in the code. In this
        // example, there are three synchronization points: the end of phase 1,
        // the end of phase 2, and the end of phase 3. The phases are not explicitly
        // defined by the Phaser class itself but are defined based on
        // the synchronization logic implemented in the code.

        // Main thread
        System.out.println("Main thread: Starting phase 1");
        phaser.arriveAndAwaitAdvance(); // Wait for all threads to complete phase 1

        // Perform phase 2 operations
        System.out.println("Main thread: Starting phase 2");
        phaser.arriveAndAwaitAdvance(); // Wait for all threads to complete phase 2

        // Perform phase 3 operations
        System.out.println("Main thread: Starting phase 3");
        phaser.arriveAndAwaitAdvance(); // Wait for all threads to complete phase 3

        phaser.arriveAndDeregister(); // Deregister the main thread from the phaser

        System.out.println("All threads completed. Main thread continues.");
    }
}

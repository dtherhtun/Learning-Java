package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.Semaphore;

class Shared {
    static int count = 0;
}

class IncThread extends Thread {
    String name;
    Semaphore semaphore;

    IncThread(String name, Semaphore sem) {
        this.name = name;
        this.semaphore = sem;
    }
    @Override
    public void run() {
        System.out.println("Staring "+ name);
        try {
            System.out.println(name + " is waiting for permit");
            semaphore.acquire();
            System.out.println("Lock acquired by "+ name);
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println("Shared count "+ Shared.count);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Lock released by "+ name);
            semaphore.release();
        }
    }
}

class DecThread extends Thread {
    String name;
    Semaphore semaphore;

    DecThread(String name, Semaphore sem) {
        this.name = name;
        this.semaphore = sem;
    }
    @Override
    public void run() {
        System.out.println("Staring "+ name);
        try {
            System.out.println(name + " is waiting for permit");
            semaphore.acquire();
            System.out.println("Lock acquired by "+ name);
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println("Shared count "+ Shared.count);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Lock released by "+ name);
            semaphore.release();
        }
    }
}
public class AnotherSemaphoreDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        IncThread inc = new IncThread("IncThread", sem);
        DecThread dec = new DecThread("DecThread", sem);

        inc.start();
        dec.start();

        try {
            inc.join();
            dec.join();

            System.out.println("Counter "+ Shared.count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

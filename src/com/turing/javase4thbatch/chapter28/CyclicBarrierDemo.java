package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class CBThread extends Thread {
    CyclicBarrier barrier;
    String name;

    CBThread(CyclicBarrier newBarrier, String newName) {
        this.barrier = newBarrier;
        this.name = newName;
    }

    public void run() {
        System.out.println("Thread "+ name + " await");
        try {
            this.barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class BarAction implements Runnable {

    @Override
    public void run() {
        System.out.println("Barrier Reached");
    }
}
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, new BarAction());

        CBThread t1 = new CBThread(barrier, "one");
        CBThread t2 = new CBThread(barrier, "two");
        CBThread t3 = new CBThread(barrier, "three");

        t1.start();
        t2.start();
        t3.start();
    }
}

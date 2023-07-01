package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.Phaser;

class PhThread extends Thread {
    Phaser phaser;
    String name;
    PhThread(Phaser phaser, String name) {
        this.name = name;
        this.phaser = phaser;
        this.phaser.register();
    }

    public void run() {
        System.out.println("Name " + name + " Beginning Phase One");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Name " + name + " Beginning Phase Two");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Name " + name + " Beginning Phase Three");
        phaser.arriveAndAwaitAdvance();
    }
}
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase = 1;

        PhThread t1 = new PhThread(phaser, "one");
        PhThread t2 = new PhThread(phaser, "two");
        PhThread t3 = new PhThread(phaser, "three");

        t1.start();
        t2.start();
        t3.start();

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+curPhase+" completed");

        phaser.arriveAndDeregister();
    }
}

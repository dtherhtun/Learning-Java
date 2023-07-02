package com.turing.javase4thbatch.chapter28;

import com.turing.javase4thbatch.chapter11.MutualExclusionProblem;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

class Data {
    AtomicInteger count = new AtomicInteger();
}

class Increase extends Thread {
    Data data;
    Increase(Data data) {
        this.data = data;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            this.data.count.addAndGet(1);
        }
    }
}
public class ConcurrentCollectionDemo {
    public static void main(String[] args) {
        Data data = new Data();

        System.out.println("Main Thread "+Thread.currentThread().getName());
        Increase t1 = new Increase(data);
        Increase t2 = new Increase(data);
        Increase t3 = new Increase(data);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("is Alive "+ t1.isAlive());
        try {
            t1.join(); // wait until all thread finish
            t2.join(); // wait until all thread finish
            t3.join(); // wait until all thread finish

            System.out.println("is Alive "+ t1.isAlive());
            System.out.println("Counter -> "+ data.count);
        } catch (InterruptedException ex) {
            Logger.getLogger(MutualExclusionProblem.class.getName());
        }
    }
}

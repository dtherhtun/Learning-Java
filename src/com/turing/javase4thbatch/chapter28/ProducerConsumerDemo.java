package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.Semaphore;

class Q {
    int n;
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    public void get(){
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Got: "+n);
        semProd.release();
    }
    public void put(int n){
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        this.n = n;
        System.out.println("Put: "+n);
        semCon.release();
    }
}

class Producer extends Thread {
    Q q;
    Producer(Q newQ) {
        this.q = newQ;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.q.put(i);
        }
    }
}

class Consumer extends Thread {
    Q q;
    Consumer(Q newQ) {
        this.q = newQ;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.q.get();
        }
    }
}
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        consumer.start();
        producer.start();
    }
}

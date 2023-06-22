package com.turing.javase4thbatch.chapter11;

class Q {
    int n;

    synchronized int get(){
        System.out.println("Got "+ n);
        return this.n;
    }
    synchronized void put(int n) {
        System.out.println("Put "+ n);
        this.n = n;
    }
}

class Producer implements Runnable {
    Q q;
    Thread thread;

    Producer(Q q){
        this.q = q;
        this.thread = new Thread(this);
    }
    public  void start(){
        this.thread.start();
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Thread thread;

    Consumer(Q q){
        this.q = q;
        this.thread = new Thread(this);
    }
    public  void start(){
        this.thread.start();
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Get by Consumer "+ q.get());
        }
    }
}
public class IncorrectProducerConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        producer.start();
        consumer.start();
    }
}

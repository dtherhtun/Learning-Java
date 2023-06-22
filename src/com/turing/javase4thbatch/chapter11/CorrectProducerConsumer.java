package com.turing.javase4thbatch.chapter11;

class CorrectQ {
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        System.out.println("Got "+ n);
        valueSet = false;
        notify();
        return this.n;
    }
    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            }catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put "+ n);
        notify();
    }
}

class CorrectProducer implements Runnable {
    CorrectQ q;
    Thread thread;

    CorrectProducer(CorrectQ q){
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

class CorrectConsumer implements Runnable {
    CorrectQ q;
    Thread thread;

    CorrectConsumer(CorrectQ q){
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
public class CorrectProducerConsumer {
    public static void main(String[] args) {
        CorrectQ q = new CorrectQ();
        CorrectProducer producer = new CorrectProducer(q);
        CorrectConsumer consumer = new CorrectConsumer(q);

        producer.start();
        consumer.start();
    }
}

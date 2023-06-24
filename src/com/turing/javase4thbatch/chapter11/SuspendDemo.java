package com.turing.javase4thbatch.chapter11;

class NewThread implements Runnable {
    String name;
    Thread thread;
    Boolean suspendFlag;

    NewThread(String name) {
        this.name = name;
        this.thread = new Thread(this);
        this.suspendFlag = false;
        this.thread.start();
    }

    public void start(){
        this.thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 16; i > 0; i--) {
                System.out.println("Thread "+name+" i = "+ i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void suspend() {
        this.suspendFlag = true;
    }
    public synchronized void resume(){
        this.suspendFlag = false;
        notify();
    }
}
public class SuspendDemo {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("one");
        NewThread t2 = new NewThread("two");


        try {
            Thread.sleep(1000);
            t1.suspend();
            System.out.println("Suspending t1");

            Thread.sleep(1000);
            t1.resume();
            System.out.println("Resuming t1");

            Thread.sleep(1000);
            t2.suspend();
            System.out.println("Suspending t2");

            Thread.sleep(1000);
            t2.resume();
            System.out.println("Resuming t2");

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

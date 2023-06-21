package com.turing.javase4thbatch.chapter11;

import java.util.logging.Logger;

class Data {
    int counter;
}

class IncThread extends Thread {
    Data data;
    IncThread(Data newData){
        this.data = newData;
    }
    public void run() {
        for (int i = 0; i < 100000; i++) {
            this.data.counter++;
        }
    }
}
public class MutualExclusionProblem {
    public static void main(String[] args) {
        Data data = new Data();
        IncThread t1 = new IncThread(data);
        IncThread t2 = new IncThread(data);
        IncThread t3 = new IncThread(data);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join(); // wait until all thread finish
            t2.join(); // wait until all thread finish
            t3.join(); // wait until all thread finish

            System.out.println("Counter -> "+ data.counter);
        } catch (InterruptedException ex) {
            Logger.getLogger(MutualExclusionProblem.class.getName());
        }
    }
}

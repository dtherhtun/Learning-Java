package com.turing.javase4thbatch.chapter11;


import java.util.logging.Logger;

class DataSync {
    int counter;
}

class IncThreadSync extends Thread {
    DataSync data;
    IncThreadSync(DataSync newData){
        this.data = newData;
    }
    public void run() {
        for (int i = 0; i < 100000; i++) {
           synchronized (this.data) {
               this.data.counter++;
           }
        }
    }
}
public class MutualExclusionSolved {
    public static void main(String[] args) {
        DataSync data = new DataSync();
        IncThreadSync t1 = new IncThreadSync(data);
        IncThreadSync t2 = new IncThreadSync(data);
        IncThreadSync t3 = new IncThreadSync(data);

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


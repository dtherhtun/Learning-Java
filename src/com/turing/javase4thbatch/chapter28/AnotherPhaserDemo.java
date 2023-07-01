package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.Phaser;


class MyThread2 extends Thread
{
    Phaser phaser;
    String name;

    MyThread2(Phaser phaser,String name)
    {
        this.phaser = phaser;
        this.name = name;
        this.phaser.register();
    }

    public void run()
    {
        while(!this.phaser.isTerminated())
        {
            System.out.println("Thread "+ name + " beginning phase "+phaser.getPhase());
            this.phaser.arriveAndAwaitAdvance();

            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class AnotherPhaser extends Phaser {
    int numOfPhase;
    AnotherPhaser(int parties,int phaseCount) {
        super(parties);
        this.numOfPhase = phaseCount - 1;
    }

    protected boolean onAdvance(int p, int registeredParties){
        System.out.println("Phase "+ p +" Completed\n");

        if ( p == numOfPhase || registeredParties == 0) {
            return true;
        }
        return false;
    }
}
public class AnotherPhaserDemo {
    public static void main(String[] args) {
        AnotherPhaser anotherPhaser = new AnotherPhaser(1, 4);
        int curPhase = 1;

        MyThread2 t1 = new MyThread2(anotherPhaser, "one");
        MyThread2 t2 = new MyThread2(anotherPhaser, "two");
        MyThread2 t3 = new MyThread2(anotherPhaser, "three");

        t1.start();
        t2.start();
        t3.start();

        while(!anotherPhaser.isTerminated())
        {
            anotherPhaser.arriveAndAwaitAdvance();
        }
        System.out.println("Phaser terminated");
    }
}

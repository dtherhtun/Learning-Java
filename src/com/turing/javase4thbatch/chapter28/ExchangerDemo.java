package com.turing.javase4thbatch.chapter28;

import java.util.concurrent.Exchanger;

class MakeString extends Thread {
    Exchanger<String> exchanger;
    String str;

    MakeString(Exchanger<String> exchanger){
        this.exchanger = exchanger;
        this.str = new String();
    }
    public void run() {
        char ch = 'A';

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                str += ch ++;

                try {
                    this.exchanger.exchange(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class UseString extends Thread {
    Exchanger<String> exchanger;
    String str;

    UseString(Exchanger<String> exchanger){
        this.exchanger = exchanger;
    }

    public void run(){
        for (int i = 0; i < 15; i++) {
            try {
                str = this.exchanger.exchange(new String());
                System.out.println("UseString got "+str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        MakeString makeString = new MakeString(exchanger);
        UseString useString = new UseString(exchanger);

        makeString.start();
        useString.start();
    }
}

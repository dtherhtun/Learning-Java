package com.turing.javase4thbatch.chapter15;

@FunctionalInterface
interface VarCapture {
    int func(int a);
}
public class VarCaptureDemo {
    public static void main(String[] args) {
        int k = 10;
        VarCapture op = (x)->{
            // k++;
            // Variable used in lambda expression should be final or effectively final
            // lambda expression captures local variable k; but can't modified k (for eg. k++)
            return x + k;
        };
        // can not be modified here also. it seems like a final variable without declaring as a final.
        // effected by lambda expression. effective final.
        // k = 20;
        System.out.println("Op " + op.func(20));
    }
}

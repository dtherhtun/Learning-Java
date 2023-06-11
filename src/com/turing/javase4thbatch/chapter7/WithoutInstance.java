package com.turing.javase4thbatch.chapter7;

/*
example of using a static variable without creating an instance of the class
 */
public class WithoutInstance {
    public static int count = 0;

    public static void increment() {
        count++;
    }
}
class Main {
    public static void main(String[] args) {
        WithoutInstance.increment();
        System.out.println("Count: " + WithoutInstance.count);
    }
}


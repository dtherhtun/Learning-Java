package com.turing.javase4thbatch.chapter13;

import static java.lang.Math.min;

// use with java -ea AssertDemo
public class AssertDemo {
    public static void main(String[] args) {
        int k = 11;
        assert k % 2 == 0;
        System.out.println("K is positive");

        System.out.println("Math.min "+ min(2, 5));
    }
}

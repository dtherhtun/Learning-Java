package com.projecteuler.problem5;

public class Main {
    static long simpleSmallestMultiple(int a, int b) {
        long i = (long) a * b;
        while (true) {
            int count = 0;
            for (int j = a; j <= b; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > b - a) {
                return i;
            }
            i += b;
        }
    }

    public static void main(String[] args) {
        System.out.println(simpleSmallestMultiple(1, 20));
    }

}

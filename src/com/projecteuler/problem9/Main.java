package com.projecteuler.problem9;

public class Main {
    static int pythagoreanTriplet(int n) {
        for (int a = 1; a < (n - 3) / 3; a++) {
            for (int b = a + 1; b < (n - 1) / 2; b++) {
                int c = n - a - b;
                if (a * a + b * b == c * c) {
                    return a * b * c;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(pythagoreanTriplet(1000));
    }
}

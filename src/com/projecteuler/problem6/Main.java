package com.projecteuler.problem6;

public class Main {
    static int SumSquareDiff(int n) {
        int sum = n * (n + 1) / 2;
        int sumSq = (2 * n + 1) * (n + 1) * n / 6;
        return power(sum, 2) - sumSq;
    }

    static int power(int base, int pow) {
        int result = 1;
        while (pow > 0) {
            result = result * base;
            pow--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SumSquareDiff(100));
    }
}

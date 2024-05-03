package com.projecteuler.problem7;

public class Main {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int thPrime(int n) {
        int i = 1;
        int count = 0;

        while (count <= n) {
            if (isPrime(i)) {
                count++;
            }
            if (count == n) {
                return i;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(thPrime(10001));
    }
}

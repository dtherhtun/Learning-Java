package com.projecteuler.project10;

public class Main {
    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

    static long sumOfPrimes(int n) {
        long sum = 0;
        boolean[] primes = sieveOfEratosthenes(n);
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfPrimes(2000000));
    }
}

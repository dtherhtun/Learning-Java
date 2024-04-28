package com.projecteuler.problem3;

public class Main {
    static long largestPrimeFactor(long n) {
        long i = 2;
        long k = n;
        long result = 0;
        while (i <= k) {
            while (isPrime(i) && k % i == 0) {
                result = i;
                k /= i;
            }
            i++;
        }
        return result;
    }

    static boolean isPrime(long n) {
        if (n <= 1) return false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
    }
}

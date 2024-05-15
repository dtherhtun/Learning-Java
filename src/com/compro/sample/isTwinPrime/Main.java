package com.compro.sample.isTwinPrime;

public class Main {
    static int isTwinPrime(int n) {
        if (!isPrime(n)) return 0;
        if (isPrime(n + 2) || isPrime(n - 2)) {
            return 1;
        }
        return 0;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isTwinPrime(5));
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(53));
        System.out.println(isTwinPrime(9));
    }
}

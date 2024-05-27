package com.compro.sample.isPrimeProduct;

public class Main {
    static int isPrimeProduct(int n) {
        int i = 2;
        while (i < n) {
            int j = i;
            while (j < n) {
                if (isPrime(i) && isPrime(j) && i * j == n) {
                    return 1;
                }
                j++;
            }
            i++;
        }
        return 0;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int IsPrimeProduct(int n) {
        for (int factor = 2; factor < n; factor++) {
            if (n % factor == 0) {
                int nextFactor = n / factor;
                if (nextFactor != factor && isPrime(factor) && isPrime(nextFactor)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(IsPrimeProduct(15));
    }
}

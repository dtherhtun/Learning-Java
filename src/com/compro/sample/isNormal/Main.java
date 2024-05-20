package com.compro.sample.isNormal;

public class Main {
    static int isNormal(int n) {
        int k = n;
        int i = 0;
        while (i <= n) {
            while (isPrime(i) && k % i == 0) {
                if (i % 2 == 1 && i != n) {
                    return 0;
                }
                k /= i;
            }
            i++;
        }
        return 1;
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

    static int IsNormal(int n) {
        for (int i = 2; i < n; i++) {
            int factor = 0;
            if (n % i == 0) {
                factor = i;
            }

            if (factor % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isNormal(10));
        System.out.println(IsNormal(10));
    }
}

package com.compro.sample.isBunker;

public class Main {
    static int isBunker(int[] a) {
        boolean oneFlag = false;
        boolean primeFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                oneFlag = true;
            }
            if (isPrime(a[i])) {
                primeFlag = true;
            }
        }
        return oneFlag && primeFlag ? 1 : 0;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBunker(new int[]{7, 6, 10, 1}));
        System.out.println(isBunker(new int[]{7, 6, 10}));
        System.out.println(isBunker(new int[]{6, 10, 1}));
        System.out.println(isBunker(new int[]{3, 7, 1, 8, 1}));
        System.out.println(isBunker(new int[]{4, 8, 10, 12, 14}));
    }
}

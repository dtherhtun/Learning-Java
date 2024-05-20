package com.compro.sample.isFineArray;

public class Main {
    static int isFineArray(int[] a) {
        int prevPrime = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) && prevPrime == 0) {
                prevPrime = a[i];
            }
            if (isPrime(a[i]) && prevPrime + 2 == a[i] || prevPrime - 2 == a[i]) {
                return 1;
            }
            if (isPrime(a[i]) && prevPrime != a[i]) {
                prevPrime = a[i];
            }
        }
        return prevPrime == 0 ? 1 : 0;
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
        System.out.println(isFineArray(new int[]{4, 7, 9, 6, 5}));
        System.out.println(isFineArray(new int[]{4, 9, 6, 33}));
        System.out.println(isFineArray(new int[]{3, 8, 15}));
        System.out.println(isFineArray(new int[]{4, 7, 6, 9, 5}));
        System.out.println(isFineArray(new int[]{4, 3, 6, 11, 13}));
    }
}

package com.compro.sample.isBeanArray;

public class Main {
    static int isBeanArray(int[] a) {
        int primeSum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                primeSum += a[i];
            }
        }
        return primeSum == a[0] ? 1 : 0;
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

    public static void main(String[] args) {
        System.out.println(isBeanArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isBeanArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isBeanArray(new int[]{10, 5, 5}));
        System.out.println(isBeanArray(new int[]{0, 6, 8, 20}));
        System.out.println(isBeanArray(new int[]{3}));
        System.out.println(isBeanArray(new int[]{8, 5, -5, 5, 3}));
    }
}

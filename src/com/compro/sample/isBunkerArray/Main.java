package com.compro.sample.isBunkerArray;

public class Main {
    static int isBunkerArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 1 && isPrime(a[i + 1])) {
                return 1;
            }
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

    public static void main(String[] args) {
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 7, 3}));
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 15, 21}));
    }
}

package com.compro.sample.isNiceArray;

public class Main {
    static int isNiceArray(int[] a) {
        if (a.length < 1) return 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                sum += a[i];
            }
        }
        return sum == a[0] ? 1 : 0;
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
        System.out.println(isNiceArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isNiceArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isNiceArray(new int[]{10, 5, 5}));
        System.out.println(isNiceArray(new int[]{0, 6, 8, 20}));
        System.out.println(isNiceArray(new int[]{3}));
        System.out.println(isNiceArray(new int[]{8, 5, -5, 5, 3}));
    }
}

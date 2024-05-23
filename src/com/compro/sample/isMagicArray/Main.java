package com.compro.sample.isMagicArray;

public class Main {
    static int isMagicArray(int[] a) {
        if (a.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                sum += a[i];
            }
        }
        return a[0] == sum ? 1 : 0;
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
        System.out.println(isMagicArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isMagicArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isMagicArray(new int[]{10, 5, 5}));
        System.out.println(isMagicArray(new int[]{0, 6, 8, 20}));
        System.out.println(isMagicArray(new int[]{3}));
        System.out.println(isMagicArray(new int[]{8, 5, 5, 5, 3}));
    }
}

package com.compro.sample.isMeera3;

public class Main {
    static int isMeera(int[] a) {
        boolean isZero = false;
        boolean isPrime = false;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                isPrime = true;
            }
            if (a[i] == 0) {
                isZero = true;
            }
        }

        return (!isZero && !isPrime) || (isZero && isPrime) ? 1 : 0;
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
        System.out.println(isMeera(new int[]{7, 6, 0, 10, 1}));
        System.out.println(isMeera(new int[]{6, 10, 1}));
        System.out.println(isMeera(new int[]{7, 6, 10}));
        System.out.println(isMeera(new int[]{6, 10, 0}));
    }
}

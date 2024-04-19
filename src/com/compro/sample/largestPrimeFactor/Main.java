package com.compro.sample.largestPrimeFactor;

public class Main {
    public static int largestPrimeFactor(int n) {
        if (n <= 1) return 0;
        int max = Integer.MIN_VALUE;
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0 && isPrime(i)) {
//                if (max < i) {
//                    max = i;
//                }
//            }
//        }

        int i = 2;
        while (i < n) {
            if (isPrime(i) && n % i == 0) {
                if (max < i) {
                    max = i;
                }
            }
            i++;
        }

        return max;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }
}

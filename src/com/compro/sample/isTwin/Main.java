package com.compro.sample.isTwin;

public class Main {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int isTwin(int[] a) {
        if (a.length < 2) return 0;
        int prevPrime = 0;

        for (int i = 0; i < a.length; i++) {
            if (prevPrime != 0 && isPrime(a[i])) {
                if (prevPrime - 2 == a[i] || prevPrime + 2 == a[i]) {
                    return 1;
                } else {
                    return 0;
                }
            }
            if (prevPrime == 0 && isPrime(a[i])) {
                prevPrime = a[i];
            }

        }
        return 0;
    }

    static int IsTwin(int[] a) { // more accurate
        boolean twinPrimeFlag;
        for (int a1 : a) {
            twinPrimeFlag = true;
            if (isPrime(a1) && (isPrime(a1 - 2) || isPrime(a1 + 2))) {
                twinPrimeFlag = false;
                for (int a2 : a) {
                    if ((isPrime(a1 - 2) && a2 == a1 - 2) || (isPrime(a1 + 2) && a2 == a1 + 2)) {
                        twinPrimeFlag = true;
                        break;
                    }
                }
            }
            if (!twinPrimeFlag)
                return 0;
        }
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(isTwin(new int[]{3, 5, 8, 10, 27}));
        System.out.println(isTwin(new int[]{11, 9, 12, 13, 23}));
        System.out.println(isTwin(new int[]{13, 14, 15, 3, 5}));
        System.out.println(isTwin(new int[]{1, 17, 8, 25, 67}));
        System.out.println("---------");
        System.out.println(IsTwin(new int[]{3, 5, 8, 10, 27}));
        System.out.println(IsTwin(new int[]{11, 9, 12, 13, 23}));
        System.out.println(IsTwin(new int[]{13, 14, 15, 3, 5}));
        System.out.println(IsTwin(new int[]{1, 17, 8, 25, 67}));
    }
}

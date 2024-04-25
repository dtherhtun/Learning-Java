package com.compro.sample.isFactorialPrime;

public class Main {
    static int isFactorialPrime(int n) {
        if (n < 0 || !isPrime(n)) return 0;
        int i = 1;
        while (i < n) {
            if (factorial(i) + 1 == n) {
                return 1;
            }
            if (factorial(i) + 1 > n) {
                break;
            }
            i++;
        }
        return 0;
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
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
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));
    }
}

package com.compro.sample.isPrimeHappy;

public class Main {
    static int isPrimeHappy(int n) {
        if (n <= 2) return 0;
        int i = 2;
        int sum = 0;
        while (i < n) {
            if (isPrime(i)) {
                sum += i;
            }
            i++;
        }
        return sum % n == 0 ? 1 : 0;
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
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));

    }
}

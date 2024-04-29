package com.compro.sample.closestFibonacci;

public class Main {
    static int closestFibonacci(int n) {
        if (n < 1) return 0;
        int a = 0;
        int b = 1;
        int temp = 0;
        while (b < n) {
            temp = a;
            a = b;
            b = temp + a;
        }

        return a;
    }

    static boolean isFibonacci(int n) {
        int a = 0;
        int b = 1;
        int temp = 0;
        while (b <= n) {
            temp = a;
            a = b;
            b = temp + a;
            if (a == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }
}

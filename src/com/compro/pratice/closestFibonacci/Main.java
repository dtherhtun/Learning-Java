package com.compro.pratice.closestFibonacci;

public class Main {
    public static int closestFibonacci(int n) {
        if (n < 1) return 0;
        int prev = 0;
        int next = 1;
        int temp = 0;
        while (next < n) {
            temp = prev;
            prev = next;
            next = prev + temp;
        }
        return prev;
    }

    public static int closestFibonacciPMK(int n) {
        if (n < 1) return 0;
        int prev = 1;
        int next = 1;
        int temp = 0;
        while (next < n) {
            temp = prev + next;
            prev = next;
            next = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
        System.out.println(closestFibonacciPMK(13));
        System.out.println(closestFibonacciPMK(33));
        System.out.println(closestFibonacciPMK(34));
    }
}

package com.compro.sample.isFibonacci2;

public class Main {
    static int isFibonacci(int n) {
        if (n < 1) return 0;
        int i = 1;
        int sum = 0;
        int prev = 0;
        while (i + prev <= n) {
            sum = prev + i;
            i = prev;
            prev = sum;

            if (prev + i == n) {
                return 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(13));
    }
}

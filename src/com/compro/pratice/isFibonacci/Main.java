package com.compro.pratice.isFibonacci;

public class Main {
    public static int isFibonacci(int n) {
        int prev = 0;
        int next = 1;
        int tmp = 0;
        while (next <= n) {
            tmp = prev + next;
            prev = next;
            next = tmp;
        }
        if (prev == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(12));
    }
}

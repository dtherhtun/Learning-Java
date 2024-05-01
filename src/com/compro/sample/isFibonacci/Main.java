package com.compro.sample.isFibonacci;

public class Main {
    static int isFibonacci(int n) {
        int a = 0;
        int b = 1;
        while (b <= n) {
            int temp = a;
            a = b;
            b = temp + b;
            if (a == n) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(34));
    }
}

package com.compro.sample.isFancy;

public class Main {
    static int isFancy(int n) {
        int a = 1;
        int b = a;
        int sum = 1;
        while (sum <= n) {
            if (sum == n) {
                return 1;
            }
            sum = (3 * a) + (2 * b);
            b = a;
            a = sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(61));
        System.out.println(isFancy(773));
    }
}

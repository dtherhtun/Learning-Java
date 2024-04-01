package com.compro.sample.isStacked;

public class Main {
    public static int isStacked(int n) {
        if (n < 1) return 0;
        int temp = 1;
        int sum = 0;

        while (temp <= n) {
            sum = sum + temp++;
            if (sum == n) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
    }
}

package com.compro.sample.isSquare;

public class Main {
    public static int isSquare(int n) {
        if (n < 0) return 0;
        int temp = 0;
        while (temp <= n) {
            if (temp * temp == n) {
                return 1;
            }
            temp++;
        }
        return 0;
    }

    public static int isSquareWai(int n) {
        int temp = 0;
        while (temp * temp < n) {
            temp++;
        }
        return temp * temp == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
        System.out.println(isSquareWai(1));
    }
}
